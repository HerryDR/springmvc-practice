package com.jsf.ssm.handler;

import com.jsf.ssm.bean.User;
import com.jsf.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @FileName UserHandler
 * @Author JSF
 * @date 2024-11-12
 **/
@RestController
@RequestMapping("/users")
public class UserHandler {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User detail(@PathVariable("id") Long id) {
        User user=userService.getById(id);
        System.out.println(user);
        return user;
    }
}
