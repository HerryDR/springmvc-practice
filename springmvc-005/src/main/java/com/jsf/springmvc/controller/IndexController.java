package com.jsf.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @FileName IndexController
 * @Author JSF
 * @date 2024-07-19
 **/
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
