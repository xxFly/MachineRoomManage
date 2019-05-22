package cn.edu.bupt.bnrc.controller;

import cn.edu.bupt.bnrc.pojo.User;
import cn.edu.bupt.bnrc.service.impl.MqTestImpl;
import cn.edu.bupt.bnrc.service.impl.UserServiceImpl;
import cn.edu.bupt.bnrc.service.interfaces.MqTest;
import cn.edu.bupt.bnrc.service.interfaces.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
    public Map<String,String> login(String user_id, String user_password, HttpSession session, Model model){
//        HttpServletRequest request

//        String s = "SSM vue前后端框架搭建成功";
//        return s;
        //vue测试
//        String userID = request.getParameter("user_id");
//        String userPassword = request.getParameter("user_password");
//        User user = new User();
//        user.setUserId(userID);
//        user.setUserPassword(userPassword);
        System.out.println("-------------"+user_id+user_password);
//        User u = userService.selectByUser(user);
//        return u;
        Map<String,String> result = new HashMap<String,String>();
        String key = "result";
        String value = "false";
//        if(u != null){
////            request.getSession().setAttribute("userID",userID);
//            value = "true";
////            return "redirect:/user/loginFaild";
//        }else{
//            value = "false";
//
////            return "redirect:/user/loginSuccess";
//        }
//        return m;

        //SSM本地测试
        if(user_id==null){
            model.addAttribute("message", "账号不为空");
//            return "/user/login";
            result.put(key,value);
            return result;
        }
        try {
        //主体,当前状态为没有认证的状态“未认证”
        Subject subject = SecurityUtils.getSubject();
        // 登录后存放进shiro token
        UsernamePasswordToken token=new UsernamePasswordToken(user_id,user_password);
        User user;
        //登录方法（认证是否通过）
        //使用subject调用securityManager,安全管理器调用Realm

            //利用异常操作
            //需要开始调用到Realm中
            System.out.println("========================================");
            System.out.println("1、进入认证方法");
            try{
                subject.login(token);
            }catch(Exception e) {
                System.out.println("异常");
                System.out.println("账号密码不正确");
//                return "redirect:/user/login";
                result.put(key,value);
                return result;
            }
            System.out.println(("3.过来了吗"));
            user = (User)subject.getPrincipal();
            session.setAttribute("user",subject);
            model.addAttribute("message", "登录完成");
            System.out.println("登录完成");
        } catch (UnknownAccountException e) {
            model.addAttribute("message", "账号密码不正确");
            System.out.println("----账号密码不正确");
            result.put(key,value);
            return result;
//            return "redirect:/user/login";
        }
        value = "true";
//        return "redirect:/user/permission";//不加redirect不行啊
        result.put(key,value);
        return result;
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
    @ResponseBody
    @CrossOrigin
    public Map<String,String> register(String user_id, String user_name, String user_password, String user_email, String user_phone,
                                       String user_signature ,String user_remark,HttpSession session, Model model)  throws Exception {
        System.out.println("======================="+user_id+user_password);

        Map<String,String> result = new HashMap<String,String>();
        String key = user_id;
        String value = user_password;
        result.put(key,value);
//        String userID = request.getParameter("user_id");
//        String userName = request.getParameter("user_name");
//        String userPassword = request.getParameter("user_password");
//        String userEmail = request.getParameter("user_email");
//        String userPhone = request.getParameter("user_phone");
        String user_headImage = "";
//        String userSignature = request.getParameter("user_signature");
        String user_authority = "";
        String user_lastLogin = "";
//        String userRemark = request.getParameter("user_remark");
        User user = new User(user_id, user_name, user_password, user_email, user_phone, user_headImage, user_signature, user_authority, user_lastLogin, user_remark);
////        System.out.println("--------------------userID:"+userID);
//        userService.insertUser(user);
//        ObjectMapper mapper=new ObjectMapper();
//        String message=mapper.writeValueAsString(user);
//        byte[] bytes= getBytesFromObject(user);
//        System.out.println("----------controller send :"+bytes);
//        amqpTemplate.convertAndSend("exchange","topic.messages",bytes);
        byte[] bytes=getBytesFromObject(user);
//        mqTest.sendMessage(bytes);
        return result;
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

    @RequestMapping("/admin")
    @CrossOrigin
    @ResponseBody
    public Map<String,String> admin(String user_id, HttpSession session, Model model){
        System.out.println("---------------admin进来了"+user_id);
        Map<String,String> result = new HashMap<String,String>();
        String key = "key";
        String value ;
        User user = userService.selectByPrimaryKey(user_id);
        if(user == null){
            value = "false";
        }else{
            value = "true";
        }

        result.put(key,value);
        return result;
//        return "/user/admin";
    }

    @RequestMapping("/guest")
    @ResponseBody
    @CrossOrigin
    public Map<String,String> guest(String user_id, String user_name){
        System.out.println("---------------guest进来了");
        Map<String,String> result = new HashMap<String,String>();
        String key = "key";
        String value = "value";
        result.put(key,value);
        return result;
//        return "/user/guest";
    }

    @RequestMapping("/permission")
    public String permission(){
        return "/user/permission";
    }

    @RequestMapping("/nopermission")
    public String nopermission(){
        return "/user/nopermission";
    }

}
