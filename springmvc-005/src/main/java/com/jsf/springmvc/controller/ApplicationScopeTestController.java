package com.jsf.springmvc.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @FileName ApplicationScopeTestController
 * @Author JSF
 * @date 2024-07-20
 **/
@Controller
public class ApplicationScopeTestController {
    @RequestMapping("/testApplication")
    public String testApplication(HttpServletRequest request) {
        ServletContext servletContext = request.getServletContext();
        servletContext.setAttribute("testApplicationScope","在SpringMVC中实现application域数据共享");
        return "ok";
    }
}
