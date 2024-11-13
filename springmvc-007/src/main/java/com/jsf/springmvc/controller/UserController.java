package com.jsf.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description
 * @FileName UserController
 * @Author JSF
 * @date 2024-07-26
 **/
@Controller
public class UserController {
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getAll() {
        System.out.println("正在查询所有。。。");
        return "ok";
    }
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String getById() {
        System.out.println("正在查询1号用户。。。");
        return "ok";
    }
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String save() {
        System.out.println("已保存");
        return "ok";
    }
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String modify() {
        System.out.println("已修改");
        return "ok";
    }
}
