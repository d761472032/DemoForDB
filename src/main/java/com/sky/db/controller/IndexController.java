package com.sky.db.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping
    @ResponseBody
    public String demo() {
        return "This is get request. url: /demo/index";
    }

}
