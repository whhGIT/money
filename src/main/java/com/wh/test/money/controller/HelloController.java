package com.wh.test.money.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @AuthorAdministrator
 * @Date2018/9/13 0013 14:04
 **/
@RestController
//@Restcontroller是@controller和ResponseBody的注解合体
public class HelloController {

    @RequestMapping("/hello")
    private String hello() {
        System.out.println("你好世界到了");
        return "你好世界啊";
    }
}
