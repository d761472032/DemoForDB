package com.sky.db.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/add")
    @ResponseBody
    public String addUser() {
        return "addUser";
    }

    @RequestMapping("/del")
    @ResponseBody
    public String addDel() {
        return "addDel";
    }

    @RequestMapping("/query")
    @ResponseBody
    public String addQuery() {
        return "addQuery";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String addUpdate() {
        return "addUpdate";
    }

}
