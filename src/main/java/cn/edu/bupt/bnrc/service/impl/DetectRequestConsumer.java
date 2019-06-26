package cn.edu.bupt.bnrc.service.impl;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class DetectRequestConsumer implements MessageListener {
    @Override
    public void onMessage(Message message) {
        System.out.println("receive getBody:{}"+new String(message.getBody()) );
    }
}
