package com.hqyj.taotaoshopping.system.controller;

import com.hqyj.taotaoshopping.system.model.User;
import com.hqyj.taotaoshopping.system.service.UserService;
import com.hqyj.taotaoshopping.system.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <p></p>
 *
 * @author : zlf
 * @date : 2020-11-04 00:59
 **/
@Controller
@RequestMapping(value = "/loginController")
public class LoginController {
    @RequestMapping(value = "/login.do")
    public String login(HttpServletRequest request, HttpServletResponse response, HttpSession session, String userName, String password, User user) {
        //注入（DI）业务接口
        UserService userService = new UserServiceImpl();
        //1.接受数据
//        //a
//        String userName = request.getParameter("userName");
//        String password = request.getParameter("password");
//        System.out.println("userName: "+userName);
//        System.out.println("password: "+password);

        //b
//        System.out.println("userName: "+userName);
//        System.out.println("password: "+password);

        //c
        //1.接受数据
        System.out.println("用户: " + user);

        //3.调用业务
        User user_db = userService.queryUserByUser(user);
        //分析業務
        if (userName.equals(user_db.getUserName())&&password.equals(user_db.getPassword())) {
            //友情提示
            request.setAttribute("message","登录成功！");
            //2.跳转页面
            return "view/frame/main";
        } else {
            //友情提示
            request.setAttribute("message","用户名或密码错误，请重新输入！！！");
            //2.跳转页面
            return "login";
        }

    }
}
