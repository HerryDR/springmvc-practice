package com.jsf.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @FileName ForwardController
 * @Author JSF
 * @date 2024-07-22
 **/
@Controller
public class ForwardController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/a")
    public String a(){
        return "redirect:/b";
    }
    @RequestMapping("/b")
    public String b(){
        return "b";
    }
}
