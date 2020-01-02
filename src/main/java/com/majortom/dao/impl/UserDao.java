package com.majortom.dao.impl;

import com.majortom.bean.*;
import com.majortom.dao.IUserDao;
import com.xuetang9.commons.jdbc.DbHelper;

import java.util.List;

/**
 * @author 李文海
 * @version 1.0
 * @desc
 * @date 2020.01.01. \ 21:14
 * @copyright &copy; xuetang9
 * @address
 */
public class UserDao implements IUserDao {
    @Override
    public User queryByName(String userName) {
        String sql = "select * from user where user_name = ?";
        return DbHelper.getSession().querySingle(User.class, sql, userName);
    }

    @Override
    public List<Privilege> queryPermissionByUserId(Long userId) {
        String sql = "select * from Privilege where id in" +
                "(select p_id from  role_privilege where role_id in(" +
                "select role_id from identification_role where i_id = (" +
                "select i_id from identification where user_id = ?)))";
        return null;
    }

    @Override
    public List<Menu> queryUserMenus(List<Privilege> permissions) {
        return null;
    }

    @Override
    public List<Folder> queryUserFolder(List<Privilege> privileges) {
        return null;
    }

    @Override
    public List<PageElements> queryUserPageElements(List<Privilege> privileges) {
        return null;
    }
}
