package cn.edu.bupt.bnrc.controller;

import cn.edu.bupt.bnrc.listener.MyServletContextListener;
import cn.edu.bupt.bnrc.pojo.Detection;
import cn.edu.bupt.bnrc.service.impl.DetectMqServiceImpl;
import cn.edu.bupt.bnrc.service.impl.DetectionServiceImpl;
import cn.edu.bupt.bnrc.service.impl.UserServiceImpl;
import cn.edu.bupt.bnrc.service.interfaces.DetectMqService;
import cn.edu.bupt.bnrc.service.interfaces.DetectionService;
import cn.edu.bupt.bnrc.service.interfaces.UserService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.BASE64Decoder;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/device")
public class DeviceController {
    @Autowired
    private DetectMqService detectMqService = new DetectMqServiceImpl();
    @Autowired
    private UserService userService = new UserServiceImpl();
    @Autowired
    private DetectionService detectionService = new DetectionServiceImpl();

    @RequestMapping("/upload")
    @CrossOrigin
    @ResponseBody
    public Map<String,String> upload(String fileBase64, String userName){
//        Enumeration paramNames = request.getParameterNames();
//            while(paramNames.hasMoreElements()) {
//            String paramName = (String)paramNames.nextElement();
//            System.out.println(paramName+": "+request.getParameter(paramName));
//        }
        System.out.println("----------"+fileBase64);
        Map<String,String> resultMap = new HashMap<String, String>();
        String key = "result";
        String value = "false";
        String file = fileBase64.split(",")[1];
        if (file == null) {
            // 图像数据为空
            resultMap.put(key,value);
            return resultMap;
//            return "false";
        }
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            // Base64解码
            System.out.println("----------------------------1");
            byte[] b = decoder.decodeBuffer(file);
            for (int i = 0; i < b.length; ++i) {
                if (b[i] < 0) {// 调整异常数据
                    b[i] += 256;
                }
            }
//            获取当时时间戳
            System.out.println("----------------------------2");
            Long timeStamp = System.currentTimeMillis();
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            Date date = new Date(timeStamp);
////            value = simpleDateFormat.format(date);
            String detectTime  = String.valueOf(System.currentTimeMillis());

            System.out.println("----------------------------3"+value);

            // 生成jpeg图片
            String basePath = "/diskb/fxx/machineroom/";
            String imgFilePath = basePath + timeStamp+".jpg";// 新生成的图片
//            String imgFilePath = timeStamp+".jpg";// 新生成的图片
            OutputStream out = new FileOutputStream(imgFilePath);
            out.write(b);
            out.flush();
            out.close();
            System.out.println("----------写图片");

//            插入数据库并获取自增ID
            int userId = userService.selectUseridByUsername(userName);
            Detection detection = new Detection(0,userId,"","","",detectTime,"");
            detectionService.insertEquipmentDetection(detection);
            int detectId = detection.getDetectId();
            System.out.println(detectId);


//            String id = String.valueOf(MyServletContextListener.snowflake.nextId());
//            System.out.println("----------id"+id);
            JSONObject detectRequest = new JSONObject();
            detectRequest.put("request_id",detectId);
            detectRequest.put("path",imgFilePath);
//            JSONArray array = new JSONArray();
//            array.add(detectRequest);
            String request = detectRequest.toString();
            detectMqService.sendMessage(request);
//
////            返回客户端
            value = String.valueOf(System.currentTimeMillis());
            resultMap.put("time",value);
            resultMap.put("request_id",String.valueOf(detectId));
            return resultMap;
        } catch (Exception e) {
            resultMap.put(key,value);
            return resultMap;
        }
//        return "ok";
    }



}
