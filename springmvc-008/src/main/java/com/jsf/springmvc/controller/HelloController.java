package com.jsf.springmvc.controller;

import com.jsf.springmvc.bean.User;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

/**
 * @Description
 * @FileName HelloController
 * @Author JSF
 * @date 2024-07-28
 **/
@Controller
public class HelloController {
    @RequestMapping(value = "/hello")
    @ResponseBody
    public User hello( )throws IOException {
        User user = new User(1,"zs","123");
        return user;
    }
    @RequestMapping(value = "/save")
    public String save(@RequestBody User user, RequestEntity requestEntity) throws IOException {
        System.out.println(requestEntity);
        System.out.println(user);
        return "success";
    }
}
