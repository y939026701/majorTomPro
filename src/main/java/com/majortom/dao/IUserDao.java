package com.majortom.dao;

import com.majortom.bean.*;

import java.util.List;

/**
 * @author 李文海
 * @version 1.0
 * @desc用户的数据操作层接口，提供一系列的涵盖用户信息的查询，增加，删除，修改接口方法
 * @date 2020.01.01\ 21:03
 * @copyright &copy; xuetang9
 * @address
 */
public interface IUserDao {
    /***
     * 根据用户名查询用户
     * @param userName
     * @return
     */
    User queryByName(String userName);

    /**
     * 根据用户编号，查询用户所拥有的所有权限
     * @param userId
     * @return
     */
    List<Privilege> queryPermissionByUserId(Long userId);

    /**
     * 根据用户的权限，查询用户所有拥有的菜单
     * @param permissions
     * @return
     */
    List<Menu> queryUserMenus(List<Privilege> permissions);

    /**
     * 根据用户的权限，查询用户所有拥有的文件夹
     * @param privileges
     * @return
     */
    List<Folder> queryUserFolder(List<Privilege> privileges);

    /**
     * 根据用户的权限，查询用户所有拥有的页面
     * @param privileges
     * @return
     */
    List<PageElements> queryUserPageElements(List<Privilege> privileges);


}
