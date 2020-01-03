package com.majortom.dao;

import com.majortom.entity.Identification;
import com.majortom.entity.User;
import com.majortom.utils.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.majortom.utils.BaseMapper;
public interface IdentificationMapper extends BaseMapper<Identification> {
    /**
     * 新增identification
     * @param identification
     * @return
     */
    int insert(Identification identification);

    /**
     * 查询identification（根据id,自定义查询,查询账号表对象）
     * @return
     */
    User queryUserByIdentificationId(int iId);
}
