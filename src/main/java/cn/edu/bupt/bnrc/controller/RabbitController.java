package cn.edu.bupt.bnrc.controller;

import cn.edu.bupt.bnrc.service.impl.MessageSender;
import cn.edu.bupt.bnrc.service.impl.MqTestImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rabbit")
public class RabbitController {
    // 注入消息生产者
    @Autowired
    private MqTestImpl mqTest;

    private Logger logger = LoggerFactory.getLogger(MessageSender.class);

    @RequestMapping(value = "/main")
    @ResponseBody
    public String main() {
        mqTest.sendMessage("main");
        return "main";
    }

    @RequestMapping(value = "/doValid")
    @ResponseBody
    public void doValid() {

        // 设置RoutingKey，匹配message.*即可
//        messageSender.setRoutingKey("message.test");
//        // 发送消息
//        messageSender.sendDataToQueue("insert Queue");
//
//        logger.info("to send message:{}","insert Queue");

//        return "{\"key\" : \"value\"}";
    }
}
