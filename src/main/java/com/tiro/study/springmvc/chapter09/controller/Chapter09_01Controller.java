package com.tiro.study.springmvc.chapter09.controller;

import com.tiro.study.springmvc.chapter09.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 最直接的Ajax处理
 */
@Controller
@RequestMapping("/chapter09")
public class Chapter09_01Controller {

    @RequestMapping("/hello")
    public String chapter09_01(){
        return "chapter09_01";
    }

    @RequestMapping(value = "/sample01")
    public ModelAndView sample01(UserModel um, HttpServletResponse response) throws IOException {

        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        response.getWriter().println("{'uuid':"+um.getUuid()+"}");
        return null;
    }
}
