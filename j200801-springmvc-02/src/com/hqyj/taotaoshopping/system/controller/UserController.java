package com.hqyj.taotaoshopping.system.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hqyj.taotaoshopping.system.model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/userController")
public class UserController {
    //增加
    @RequestMapping(value = "/list.do")
    public String list(HttpServletRequest request, HttpServletResponse response, User user) {
        return "view/system/user/userList";
    }
	//增加
    @RequestMapping(value = "/add.do")
    public String add(HttpServletRequest request, HttpServletResponse response, User user) {
        return "";
    }
//    //刪除
//    @RequestMapping(value = "/delete.do")
//    public String delete(HttpServletRequest request, HttpServletResponse response, User user) {
//        return "";
//    }
//    //修改
//    @RequestMapping(value = "/update.do")
//    public String update(HttpServletRequest request, HttpServletResponse response, User user) {
//        return "";
//    }
//    //查詢
//    @RequestMapping(value = "/queryAllUser.do")
//    public String queryAllUser(HttpServletRequest request, HttpServletResponse response, User user) {
//        return "";
//    }
}
