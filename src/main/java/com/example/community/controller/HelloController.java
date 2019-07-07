package com.example.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yaoweixin
 * @date 2019/7/7-18:35
 */
@Controller
public class HelloController {
    @GetMapping
    public String testHello(@RequestParam(name = "name")String name, Model model){
         model.addAttribute("name",name );
         return "hello";

    }
}
