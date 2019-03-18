package com.hr.springboot5.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/test")
public class TestController {

    @RequestMapping("findAll")
    public ModelAndView find(){
        System.out.println("ghhhhhh");
        ModelAndView mv=new ModelAndView();
        return  mv;
    }
}
