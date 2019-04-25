package cn.edu.bupt.bnrc.service.impl;

import cn.edu.bupt.bnrc.service.interfaces.MqTest;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;

//public class MqTestImpl{
@Service("MqTestImpl")
public class MqTestImpl implements MqTest {

    @Resource(name = "amqpTemplate")
    private AmqpTemplate amqpTemplate;

    @Override
    public void sendMessage(Object message) {
        amqpTemplate.convertAndSend("queueTestKey",message);
    }
}
