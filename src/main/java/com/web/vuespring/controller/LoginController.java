package com.web.vuespring.controller;

import com.web.vuespring.pojo.User;
import com.web.vuespring.result.Result;
import com.web.vuespring.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping(value = "/api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);
        User user = userService.get(username, requestUser.getPassword());
        if (null == user) {
            System.out.println("no");
            return new Result(400);
        } else {
            System.out.println("yes");
            return new Result(200);
        }
    }
}

