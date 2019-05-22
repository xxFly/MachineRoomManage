package cn.edu.bupt.bnrc.service.impl;

import cn.edu.bupt.bnrc.dao.UserMapper;
import cn.edu.bupt.bnrc.pojo.EquipmentDetection;
import cn.edu.bupt.bnrc.service.interfaces.EquipmentDetectionService;
import cn.edu.bupt.bnrc.service.interfaces.EquipmentService;
import cn.edu.bupt.bnrc.service.interfaces.UserService;
import org.json.JSONObject;
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
    private EquipmentDetectionService equipmentDetecionService = new EquipmentDetectionServiceImpl();

    @Override
    public void onMessage(Message message) {
//        System.out.println("消费消息receive getBody:{}"+message.getBody());
//        System.out.println("消费消息receive getBody:{}"+message.toString());
        System.out.println("消费消息receive getBody:{}"+message.toString() );

//        System.out.println("receive getMessageProperties:{}"+message.getMessageProperties());
//        System.out.println("receive getClass:{}"+message.getClass());
//        userService.selectByUser()
//        用户注册 --------
//        User user;
//        try {
//            user = (User) getObjectFromBytes(message.getBody());
//            System.out.println("--------------------------messages ："+user);//.toString()
//            userService.insertUser(user);
//        } catch (Exception e) {
//            System.out.println("--------------------------接收异常 ：");
//
//            e.printStackTrace();
//        }
//
////        try {
////            String s = new String(message.getBody(), "UTF-8");
////            System.out.println("------>MQ接收到的数据："+s);
////        } catch (UnsupportedEncodingException e) {
////            // TODO Auto-generated catch block
////            e.printStackTrace();
////        }
//                -----------用户注册
//        设备检测------------------
//        调用接口获取json数据
        String jsonContent = "{'equip_brand':'a','equip_version':'1','equip_location':'1'}";
        JSONObject jsonObject = new JSONObject(jsonContent);
//        String equip_time = message.toString();
        String equip_time = message.toString().split("'")[1].split(" ")[0];
        String user_id = message.toString().split("'")[1].split(" ")[1];
        System.out.println(user_id);
        String equip_brand = jsonObject.getString("equip_brand");
        String equip_version = jsonObject.getString("equip_version");
        String equip_location = jsonObject.getString("equip_location");
        EquipmentDetection equipmentDetection = new EquipmentDetection(equip_time, user_id, equip_brand,equip_version,equip_location);
        equipmentDetecionService.insertEquipmentDetection(equipmentDetection);
//        System.out.println(equipmentDetection.toString());
//                ------------------设备检测


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
