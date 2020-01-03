package com.majortom.service;

import com.majortom.entity.User;

/**
 * 用户服务层操作
 * @author 李文海
 */
public interface IUserService {
    /**
     * 通过邮箱或者电话获取用户信息
     * @param account
     * @return
     */
    User queryByName(String account);

    /**
     * 注册用户时使用的区别电话和邮箱的添加方法
     * @param user
     * @param
     * @return
     */
   boolean add(User user);
}
