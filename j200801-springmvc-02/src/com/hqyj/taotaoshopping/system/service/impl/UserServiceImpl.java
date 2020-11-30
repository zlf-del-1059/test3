package com.hqyj.taotaoshopping.system.service.impl;

import com.hqyj.taotaoshopping.system.dao.UserDao;
import com.hqyj.taotaoshopping.system.dao.impl.UserDaoImpl;
import com.hqyj.taotaoshopping.system.model.User;
import com.hqyj.taotaoshopping.system.service.UserService;

/**
 * <p>业务接口实现</p>
 *
 * @author : zlf
 * @date : 2020-11-04 15:25
 **/

public class UserServiceImpl implements UserService {
    //注入：數據訪問接口
    UserDao userDao = new UserDaoImpl();
    @Override
    public User queryUserByUser(User user) {
//        User user_db =   serDao.queryUserByUser(user);
//        return user_db;
        return userDao.queryUserByUser(user);
    }
}
