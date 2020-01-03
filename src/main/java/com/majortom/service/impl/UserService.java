package com.majortom.service.impl;

import com.majortom.dao.UserMapper;
import com.majortom.entity.User;
import com.majortom.service.IUserService;
import com.majortom.utils.Constant;
import com.majortom.utils.DBHelper;

/**
 * 用户服务层接口实现
 * @author 李文海
 */
public class UserService implements IUserService {
       private UserMapper mapper = DBHelper.getMapper(UserMapper.class);
    @Override
    public User queryByName(String account) {
        if(account.contains(Constant.AT)){
           return mapper.queryListByColumn("email",account).get(0);

        }else if (account.matches(Constant.ENSURENUM)){
           return mapper.queryListByColumn("tel",account).get(0);

        }
        return null;
    }

    @Override
    public boolean add(User user) {
        return mapper.add(user)>0;
    }
}
