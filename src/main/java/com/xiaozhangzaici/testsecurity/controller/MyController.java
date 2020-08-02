package com.xiaozhangzaici.testsecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping("/abc")
    public String abc() {
        return "abc";
    }
}
