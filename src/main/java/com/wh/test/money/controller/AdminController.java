package com.wh.test.money.controller;

import com.wh.test.money.pojo.Admin;
import com.wh.test.money.service.AdminService;
import com.wh.test.money.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName AdminController
 * @AuthorAdministrator
 * @Date2018/9/13 0013 17:14
 **/
@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    //新增
    @PostMapping("/adminsave.do")
    public String add(Admin admin) {
        if (adminService.save(admin)) {
            return "adminlist";
        } else {
            return "adminadd";
        }
    }

    //分页查询
    @GetMapping("/adminPage.do")
    @ResponseBody
    public PageVo<Admin> page(int page, int limit) {
        return adminService.queryByPage(page,limit);
    }
}
