package com.jsf.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @FileName IndexController
 * @Author JSF
 * @date 2024-07-30
 **/
@Controller
public class IndexController {
    @RequestMapping(value = "/")
    public String index() {
        System.out.println("执行");
        return "index";
    }
}
