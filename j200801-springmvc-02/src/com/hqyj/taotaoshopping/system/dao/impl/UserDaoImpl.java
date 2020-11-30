package com.hqyj.taotaoshopping.system.dao.impl;

import com.hqyj.taotaoshopping.system.dao.UserDao;
import com.hqyj.taotaoshopping.system.model.User;

import java.util.Date;

/**
 * <p>数据库接口实现</p>
 *
 * @author : zlf
 * @date : 2020-11-04 15:29
 **/

public class UserDaoImpl implements UserDao {
    @Override
    public User queryUserByUser(User user) {
        //四大参数
        //-->伪数据
        User user_db =new User();
        user_db.setUserId(007);
        user_db.setName("吹畫");
        user_db.setAge("18");
        user_db.setSex("女");
        user_db.setHobby("唱歌");
        user_db.setUserName("admin");
        user_db.setPassword("111");
        user_db.setCreate_time(new Date());



        return user_db;
    }
}
