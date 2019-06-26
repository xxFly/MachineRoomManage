package cn.edu.bupt.bnrc.service.impl;

import cn.edu.bupt.bnrc.dao.UserMapper;
import cn.edu.bupt.bnrc.pojo.Detection;
import cn.edu.bupt.bnrc.service.interfaces.DetectionService;
import cn.edu.bupt.bnrc.service.interfaces.EquipmentService;
import cn.edu.bupt.bnrc.service.interfaces.UserService;
//import org.json.JSONArray;
//import org.json.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class MessageConsumer implements MessageListener {

    private Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService = new UserServiceImpl();
    @Autowired
    private EquipmentService equipmentService = new EquipmentServiceImpl();
    @Autowired
    private DetectionService equipmentDetecionService = new DetectionServiceImpl();

    @Override
    public void onMessage(Message message) {
        System.out.println("消费消息receive getBody:{}"+message.toString() );

//        设备检测------------------
//        调用接口获取json数据
//        String jsonContent = "[{'detect_brand':'a','detect_version':'1','detect_location':'1'},{'detect_brand':'b','detect_version':'2','detect_location':'2'}]";
//        JSONArray jsonArray = JSONArray.parseArray(jsonContent);
//        for(int i = 0; i < jsonArray.size(); i++){
//            JSONObject jsonObject = jsonArray.getJSONObject(i);
//            int detect_id = 0;
//            String detect_time = message.toString().split("'")[1].split(" ")[0]+"_"+i;
////        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
////        Date date = new Date(Long.parseLong(detect_time));
////        String timeStamp = simpleDateFormat.format(date);
//
//            int user_id = Integer.parseInt(message.toString().split("'")[1].split(" ")[1]);
//            System.out.println(user_id);
//            String detect_brand = jsonObject.getString("detect_brand");
//            String detect_version = jsonObject.getString("detect_version");
//            String detect_location = jsonObject.getString("detect_location");
//            String detect_extra = "";
//            Detection detection = new Detection(detect_id, user_id, detect_brand, detect_version, detect_location, detect_time, detect_extra);
//            equipmentDetecionService.insertEquipmentDetection(detection);
//        }
    }

    //字节码转化为对象
    public  Object getObjectFromBytes(byte[] objBytes) throws Exception {
        if (objBytes == null || objBytes.length == 0) {
            return null;
        }
        ByteArrayInputStream bi = new ByteArrayInputStream(objBytes);
        ObjectInputStream oi = new ObjectInputStream(bi);
        return oi.readObject();
    }

}
