package com.jsf.ssm.dao;

import com.jsf.ssm.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Description
 * @FileName UserDao
 * @Author JSF
 * @date 2024-11-12
 **/
public interface UserDao {
    @Select("select * from tbl_user where id = #{id}")
    User selectById(Long id);
}
