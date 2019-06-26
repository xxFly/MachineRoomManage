package cn.edu.bupt.bnrc.controller;

import cn.edu.bupt.bnrc.service.impl.MessageSender;
import cn.edu.bupt.bnrc.service.impl.DetectMqServiceImpl;
import cn.edu.bupt.bnrc.service.interfaces.DetectMqService;
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
    private DetectMqService detectMqService = new DetectMqServiceImpl();

    private Logger logger = LoggerFactory.getLogger(MessageSender.class);

    @RequestMapping(value = "/main")
    @ResponseBody
    public String main() {
        System.out.println("==============已发送main消息");
        for(int i = 0; i < 5; i++){
            String str = Integer.toString(i);
//            detectMqService.sendMessage("main"+str);

        }
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
