package com.jsf.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Description
 * @FileName Index
 * @Author JSF
 * @date 2024-07-16
 **/
@Controller
public class Index {
    @RequestMapping("/")
    public String index() {
        return "/index";
    }

    @RequestMapping("/index/{username}/{password}")
    public String index1(
            @PathVariable("username") String username,
            @PathVariable("password") String password){
        System.out.println("用户名："+username+"   "+"密码："+password);
        return "index";
    }

    @PostMapping("/login")
    public String login() {
        return "testMethod";
    }

    @RequestMapping(value = "/testParams",params = {"username","password"})
    public String testParams(){
        return "testParams";
    }

    @RequestMapping(value = "testHeaders",headers = {"Referer=http://localhost:8080/springmvc/"})
    public String testHeaders(){
        return "testHeaders";
    }
}
