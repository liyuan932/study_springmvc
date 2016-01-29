package com.tiro.study.springmvc.chapter01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wb-liyuan.j on 2016/1/29.
 */
@Controller
@RequestMapping("/")
public class HelloController {
    @RequestMapping("/index")
    public String hello(){
        return "hello";
    }
}
