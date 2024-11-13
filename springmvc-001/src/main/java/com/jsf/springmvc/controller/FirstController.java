package com.jsf.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @FileName FirstController
 * @Author JSF
 * @date 2024-07-14
 **/
@Controller
public class FirstController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/hehe")
    public String hehe(){
        System.out.println("正在处理请求。。。");
        return "first";
    }
    @RequestMapping("/haha")
    public String haha(){
        return "second";
    }
}
