package com.jsf.springmvc.controller;

import com.jsf.springmvc.pojo.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.Arrays;

/**
 * @Description
 * @FileName UserController
 * @Author JSF
 * @date 2024-07-17
 **/
@Controller
public class UserController {
    @RequestMapping("/")
    public String toRegisterPage(){
        return "register";
    }
    @RequestMapping(value = "register",method = RequestMethod.GET)
    public String register(
            User user,
            @RequestHeader(value = "Referer", required = false)
            String referer,
            @CookieValue(value = "id",required = false)
            String cookieId
    ){
        System.out.println(user);
        System.out.println(referer);
        System.out.println(cookieId);
        return "ok";
    }

}
