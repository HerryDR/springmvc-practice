package com.jsf.springmvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Description
 * @FileName ExceptionController
 * @Author JSF
 * @date 2024-07-29
 **/
@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler
    public String tip(Exception e, Model model) {
        model.addAttribute("e",e);
        return "tip";
    }
}
