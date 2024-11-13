package com.jsf.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @FileName ProductController
 * @Author JSF
 * @date 2024-07-16
 **/
@RequestMapping("product")
@Controller
public class ProductController {
    @RequestMapping("detail")
    public String toDetail( ) {
        return "product/detail";
    }
}
