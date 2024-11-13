package com.jsf.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @Description
 * @FileName RequestScopeTestComtroller
 * @Author JSF
 * @date 2024-07-19
 **/
@Controller
public class RequestScopeTestController {
    @RequestMapping("testModel")
    public String testModel(Model model) {
        model.addAttribute("testRequestScope", "在SpringMVC中使用Model接口实现request域数据共享");
        return "ok";
    }
    @RequestMapping("testMap")
    public String testMap(Map<String, Object> map) {
        map.put("testRequestScope","在SpringMVC中使用Map接口实现request域数据共享");
        return "ok";
    }
    @RequestMapping("testModelMap")
    public String testModelMap(ModelMap modelMap) {
        modelMap.addAttribute("testRequestScope", "在SpringMVC中使用ModelMap接口实现request域数据共享");
        return "ok";
    }
    @RequestMapping("testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("testRequestScope","在SpringMVC中使用ModelAndView类实现request域数据共享");
        modelAndView.setViewName("ok");
        return modelAndView;
    }
}
