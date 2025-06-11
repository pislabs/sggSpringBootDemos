package com.pislabs.springboot.helloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author rayl
 * @description:
 * @date 2025/6/7 01:48
 */
@Controller
public class HelloController {
    @Value("${person.lastName}")
    private String lastName;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World! " + lastName;
    }
}
