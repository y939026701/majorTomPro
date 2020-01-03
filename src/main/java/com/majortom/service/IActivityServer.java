package com.majortom.service;

import com.majortom.entity.Activity;

import java.util.List;

/**
 * @author 李文海
 * @version 1.0
 * @desc 活动实体类的服务层接口
 * @date 2020.01.03\ 9:38
 * @copyright &copy; xuetang9
 * @address
 */
public interface IActivityServer {
    /**
     * 活动数据总数
     * @return
     */
    int count();

    /**
     * 分页查询
     * @param start
     * @param limit
     * @return
     */
    List<Activity> queryPage(int start, int limit);
}
