package cn.edu.bupt.bnrc.service.impl;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class DetectResponseConsumer  implements MessageListener {
    @Override
    public void onMessage(Message message) {
        System.out.println("消费消息receive getBody:{}"+message.toString() );
    }
}
