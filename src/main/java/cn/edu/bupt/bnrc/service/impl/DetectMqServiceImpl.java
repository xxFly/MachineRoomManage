package cn.edu.bupt.bnrc.service.impl;

import cn.edu.bupt.bnrc.service.interfaces.DetectMqService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//public class DetectMqServiceImpl{
@Service
public class DetectMqServiceImpl implements DetectMqService {

    @Resource(name = "amqpTemplate")
    private AmqpTemplate amqpTemplate;

    @Override
    public void sendMessage(Object message) {
        System.out.println("---------------------send message:"+ message);
//        System.out.println("---------------------send message:"+ message.toString());
//        amqpTemplate.convertAndSend("detectRequestQueueKey",message);
        amqpTemplate.convertAndSend("clientRequestQueueKey",message);
    }
}
