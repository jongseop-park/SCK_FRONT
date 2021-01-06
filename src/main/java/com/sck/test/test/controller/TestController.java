package com.sck.test.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/")
    public String intro() {
        return "intro";
    }

    @RequestMapping("/main")
    public String main(){

        return "main";
    }

    @RequestMapping("/detail")
    public String index(){

        return "detail";
    }

}
