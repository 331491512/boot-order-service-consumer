package com.atguigu.gmall.bootorderserviceconsumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/init")
    public String init() {
        return "hello word";
    }
}
