package com.hqyj.taotaoshopping.system.dao;

import com.hqyj.taotaoshopping.system.model.User;

/**
 * <p>数据库接口</p>
 *
 * @author : zlf
 * @date : 2020-11-04 15:28
 **/

public interface UserDao {
    User queryUserByUser(User user);
}
