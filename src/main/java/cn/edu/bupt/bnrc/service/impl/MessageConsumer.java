package cn.edu.bupt.bnrc.service.impl;

import cn.edu.bupt.bnrc.dao.UserMapper;
import cn.edu.bupt.bnrc.pojo.User;
import cn.edu.bupt.bnrc.service.interfaces.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

public class MessageConsumer implements MessageListener {

    private Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService = new UserServiceImpl();

    @Override
    public void onMessage(Message message) {
        System.out.println("receive getBody:{}"+message.getBody());
        System.out.println("receive getMessageProperties:{}"+message.getMessageProperties());
        System.out.println("receive getClass:{}"+message.getClass());
//        userService.selectByUser()
        User user;
        try {
            user = (User) getObjectFromBytes(message.getBody());
//            System.out.println(user);
            System.out.println("--------------------------messages ："+user);//.toString()
            userService.insertUser(user);
        } catch (Exception e) {
            System.out.println("--------------------------接收异常 ：");

            e.printStackTrace();
        }

//        try {
//            String s = new String(message.getBody(), "UTF-8");
//            System.out.println("------>MQ接收到的数据："+s);
//        } catch (UnsupportedEncodingException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
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
