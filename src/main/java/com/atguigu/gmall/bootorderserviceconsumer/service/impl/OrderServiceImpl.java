package com.atguigu.gmall.bootorderserviceconsumer.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.DetailService;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;

@Service
@Component
public class OrderServiceImpl implements OrderService {

    @Reference
    UserService userService;

    @Reference
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
