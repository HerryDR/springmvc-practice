package com.jsf.springmvc.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @FileName UserController
 * @Author JSF
 * @date 2024-07-16
 **/
@RequestMapping("user")
@Controller public class UserController {
    @RequestMapping("detail")
    public String toDetail( ) {
        return "user/detail";
    }
}
