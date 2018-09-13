package com.wh.test.money.mapper;


import com.wh.test.money.pojo.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    //查询数量
    int selectCount();

    //分页查询
    List<Admin> selectByPage(@Param("index") int index,@Param("count") int count);
}