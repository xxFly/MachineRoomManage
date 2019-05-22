package cn.edu.bupt.bnrc.controller;

import cn.edu.bupt.bnrc.pojo.Equipment;
import cn.edu.bupt.bnrc.pojo.EquipmentDetection;
import cn.edu.bupt.bnrc.service.impl.MqTestImpl;
import cn.edu.bupt.bnrc.service.interfaces.MqTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.BASE64Decoder;

import javax.servlet.http.HttpServletRequest;
import javax.xml.crypto.Data;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/device")
public class DeviceController {
    @Autowired
    private MqTest mqTest = new MqTestImpl();

    @RequestMapping("/upload")
    @CrossOrigin
    @ResponseBody
    public Map<String,String> upload(String fileBase64, String user_id){
//        Enumeration paramNames = request.getParameterNames();
//        while(paramNames.hasMoreElements()) {
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
            byte[] b = decoder.decodeBuffer(file);
            for (int i = 0; i < b.length; ++i) {
                if (b[i] < 0) {// 调整异常数据
                    b[i] += 256;
                }
            }
            value = String.valueOf(System.currentTimeMillis()) + " " + user_id;
            resultMap.put(key,value);
            // 生成jpeg图片
            String imgFilePath = "C:\\Users\\Fecinly\\Desktop\\machinePicture\\"+value+".jpg";// 新生成的图片
            OutputStream out = new FileOutputStream(imgFilePath);
            out.write(b);
            out.flush();
            out.close();
            mqTest.sendMessage(value);
            return resultMap;
        } catch (Exception e) {
            resultMap.put(key,value);
            return resultMap;
        }
//        return "ok";
    }



}
