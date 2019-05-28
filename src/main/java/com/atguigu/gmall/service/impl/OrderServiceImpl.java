package com.atguigu.gmall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.DetailService;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    @Autowired
    DetailService detailService;

    public List<UserAddress> initOrder(String userId) {
        // 1、查询用户的收货地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        return userAddressList;
    }

    public String sayHellow() {
        String sayHellow = detailService.sayHellow();
        System.out.println(sayHellow);
        return sayHellow;
    }

}
