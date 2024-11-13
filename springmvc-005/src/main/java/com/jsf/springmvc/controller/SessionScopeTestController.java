package com.jsf.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @Description
 * @FileName SessionScopeTestController
 * @Author JSF
 * @date 2024-07-19
 **/
@Controller
@SessionAttributes("testSessionScope")
public class SessionScopeTestController {
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model) {
        model.addAttribute("testSessionScope","在SpringMVC中使用@SessionAttributes注解实现session域数据共享");
        return "ok";
    }
}
