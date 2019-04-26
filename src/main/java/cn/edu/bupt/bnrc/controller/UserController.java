package cn.edu.bupt.bnrc.controller;

import cn.edu.bupt.bnrc.pojo.User;
import cn.edu.bupt.bnrc.service.impl.MqTestImpl;
import cn.edu.bupt.bnrc.service.impl.UserServiceImpl;
import cn.edu.bupt.bnrc.service.interfaces.MqTest;
import cn.edu.bupt.bnrc.service.interfaces.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@Controller
@RequestMapping("/user")
public class UserController {

    // 注入消息生产者
    @Autowired
    private MqTest mqTest = new MqTestImpl();

    @Autowired
    private UserService userService = new UserServiceImpl();

    @RequestMapping("/login")
    public String login(){
        return "user/login";
    }
    @RequestMapping("/doLogin")
    @ResponseBody
    @CrossOrigin
    public String login(HttpServletRequest request){

//        String s = "SSM vue前后端框架搭建成功";
//        return s;
        String userID = request.getParameter("user_id");
        String userPassword = request.getParameter("user_password");
        User user = new User();
        user.setUserId(userID);
        user.setUserPassword(userPassword);
        System.out.println("-------------"+userID+userPassword);
        User u = userService.selectByUser(user);
//        return u;


        if(u == null){
//            request.getSession().setAttribute("userID",userID);
            return "redirect:/user/loginFaild";
        }else{
            return "redirect:/user/loginSuccess";
        }
    }

    @RequestMapping("/loginFaild")
    public String loginFaild(){
        return "user/loginFaild";
    }

    @RequestMapping("/loginSuccess")
    public String loginSuccess(){
        return "user/loginSuccess";
    }

    @RequestMapping("/register")
    public String register(){
        return "/user/register" ;
    }

    @RequestMapping("/doRegister")
    public String register(HttpServletRequest request)  throws Exception {
        String userID = request.getParameter("user_id");
        String userName = request.getParameter("user_name");
        String userPassword = request.getParameter("user_password");
        String userEmail = request.getParameter("user_email");
        String userPhone = request.getParameter("user_phone");
        String userHeadImage = "";
        String userSignature = request.getParameter("user_signature");
        String userAuthority = "";
        String userLastLogin = "";
        String userRemark = request.getParameter("user_remark");
        User user = new User(userID, userName, userPassword, userEmail, userPhone, userHeadImage, userSignature, userAuthority, userLastLogin, userRemark);
//        System.out.println("--------------------userID:"+userID);
//        userService.insertUser(user);
//        ObjectMapper mapper=new ObjectMapper();
//        String message=mapper.writeValueAsString(user);
//        byte[] bytes= getBytesFromObject(user);
//        System.out.println("----------controller send :"+bytes);
//        amqpTemplate.convertAndSend("exchange","topic.messages",bytes);
        byte[] bytes=getBytesFromObject(user);
        mqTest.sendMessage(bytes);
        return "redirect:/user/registerSuccess";
    }

    @RequestMapping("/registerSuccess")
    public String registerSuccess(){
        return "/user/registerSucess";
    }

    //对象转化为字节码
    public  byte[] getBytesFromObject(Serializable obj) throws Exception {
        if (obj == null) {
            return null;
        }
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(obj);
        return bo.toByteArray();
    }

}
