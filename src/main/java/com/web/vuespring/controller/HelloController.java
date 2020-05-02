package com.web.vuespring.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloController {
    @RequestMapping("/")
    public String hello() {
        return "This is SpringBoot";
    }

    @RequestMapping("/info")
    public String getInfo(@RequestParam String name) {
        return name;
    }
}
