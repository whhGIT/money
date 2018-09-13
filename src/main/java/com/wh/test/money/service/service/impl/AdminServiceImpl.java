package com.wh.test.money.service.service.impl;

import com.wh.test.money.mapper.AdminMapper;
import com.wh.test.money.pojo.Admin;
import com.wh.test.money.service.AdminService;
import com.wh.test.money.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName AdminServiceImpl
 * @AuthorAdministrator
 * @Date2018/9/13 0013 17:11
 **/
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public boolean save(Admin admin) {
        return adminMapper.insert(admin)>0;
    }

    @Override
    public PageVo<Admin> queryByPage(int page, int limit) {
        int index = (page - 1) * limit;
        return new PageVo<>(adminMapper.selectCount(),adminMapper.selectByPage(index,limit));

    }
}
