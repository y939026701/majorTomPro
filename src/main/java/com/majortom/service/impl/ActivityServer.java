package com.majortom.service.impl;

import com.majortom.dao.ActivityMapper;
import com.majortom.entity.Activity;
import com.majortom.service.IActivityServer;
import com.majortom.utils.DBHelper;

import java.util.List;

/**
 * @author 李文海
 * @version 1.0
 * @desc
 * @date 2020.01.03. \ 9:39
 * @copyright &copy; xuetang9
 * @address
 */
public class ActivityServer implements IActivityServer {
    private ActivityMapper mapper = DBHelper.getMapper(ActivityMapper.class);
    @Override
    public int count() {
        return mapper.count(Activity.class);
    }

    @Override
    public List<Activity> queryPage(int start, int limit) {
        return mapper.getByLimit(Activity.class, start, limit);
    }
}
