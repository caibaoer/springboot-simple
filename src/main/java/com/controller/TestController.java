package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname TestController
 * @Description TODO
 * @Date 2021/8/25 17:14
 * @Created by huangwencai
 */
@RestController
public class TestController {
    public TestController() {
        System.out.println("TestController...");
    }

    @RequestMapping("test")
    public String test(){
        return "test";
    }
}
