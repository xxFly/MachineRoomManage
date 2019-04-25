package cn.edu.bupt.bnrc.service.impl;

import cn.edu.bupt.bnrc.dao.UserMapper;
import cn.edu.bupt.bnrc.pojo.User;
import cn.edu.bupt.bnrc.service.interfaces.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.UnsupportedEncodingException;
import java.util.List;

public class MessageConsumer implements MessageListener, UserService {

    private Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;

    @Override
    public void onMessage(Message message) {
        System.out.println("receive message:{}"+message.getBody());
//        userService.selectByUser()
        try {
            String s = new String(message.getBody(), "UTF-8");
            System.out.println("------>MQ接收到的数据："+s);
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int deleteUserById(Integer id) {
        return 0;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public User selectByUser(User user) {
        return null;
    }

    @Override
    public List<User> queryAllUser() {
        return null;
    }

    @Override
    public void mqTest(Message message) {
        logger.info("--------------------------message:",message);
    }
}