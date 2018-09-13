package com.wh.test.money.service;

import com.wh.test.money.pojo.Admin;
import com.wh.test.money.vo.PageVo;

/**
 * @ClassName AdminService
 * @AuthorAdministrator
 * @Date2018/9/13 0013 16:57
 **/
public interface AdminService {
    //新增
    boolean save(Admin admin);

    //查询
    PageVo<Admin> queryByPage(int page,int limit);
}
