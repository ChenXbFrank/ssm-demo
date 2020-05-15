package com.cxb.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/helloJsp")
    public  String index(){
        return "hello";
    }
}
