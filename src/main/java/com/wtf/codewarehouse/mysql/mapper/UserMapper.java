package com.wtf.codewarehouse.mysql.mapper;

import com.wtf.codewarehouse.mysql.po.User;
import com.wtf.codewarehouse.mysql.po.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int batchInsert(@Param("list") List<User> users);

    int batchInsertOrUpdate(@Param("list") List<User> users);

    Integer getMaxId();
}