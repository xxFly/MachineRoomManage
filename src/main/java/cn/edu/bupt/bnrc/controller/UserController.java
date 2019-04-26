package cn.edu.bupt.bnrc.controller;

import cn.edu.bupt.bnrc.pojo.User;
import cn.edu.bupt.bnrc.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

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
        user.setUserId(Integer.parseInt(userID));
        user.setUserPassword(userPassword);
        User u = userService.selectByUser(user);
//        return u;


        if(u == null){
//            request.getSession().setAttribute("userID",userID);
            return "redirect:/user/loginSuccess";
        }else{
            return "redirect:/user/loginFaild";
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
    public String register(HttpServletRequest request){
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
        User user = new User(Integer.parseInt(userID), userName, userPassword, userEmail, userPhone, userHeadImage, userSignature, userAuthority, userLastLogin, userRemark);
        userService.insertUser(user);
        return "redirect:/user/registerSuccess";
    }

    @RequestMapping("/registerSuccess")
    public String registerSuccess(){
        return "/user/registerSucess";
    }

}
