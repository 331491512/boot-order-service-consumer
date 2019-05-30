package com.atguigu.gmall.bootorderserviceconsumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/initUserAddress")
    public List<UserAddress> initUserAddress(@RequestParam("userId") String userId) {
        System.out.println("initUserAddress方法");
        List<UserAddress> initOrder = orderService.initOrder(userId);
        return initOrder;
    }

    @GetMapping("/hello")
    public String hello() {
        System.out.println("initUserAddress方法");
        return "Hello SpringBoot Project.";
    }
}
