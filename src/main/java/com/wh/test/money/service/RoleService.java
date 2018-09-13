package com.wh.test.money.service;

import com.wh.test.money.pojo.Admin;
import com.wh.test.money.pojo.Role;
import com.wh.test.money.vo.PageVo;

import java.util.List;

/**
 * @ClassName RoleService
 * @AuthorAdministrator
 * @Date2018/9/13 0013 17:05
 **/
public interface RoleService {
    //新增
    boolean save(Role role);

    //查询
    PageVo<Role> queryByPage(int page, int limit);

    //查询所有
    List<Role> queryAll();
}
