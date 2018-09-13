package com.wh.test.money.service;

import com.wh.test.money.pojo.Admin;
import com.wh.test.money.pojo.Resource;
import com.wh.test.money.pojo.Role;
import com.wh.test.money.vo.PageVo;

import java.util.List;

/**
 * @ClassName ResourceService
 * @AuthorAdministrator
 * @Date2018/9/13 0013 17:07
 **/
public interface ResourceService {
    //新增
    boolean save(Resource resource);

    //查询
    PageVo<Resource> queryByPage(int page, int limit);

    //查询所有
    List<Resource> queryAll(int type);
}
