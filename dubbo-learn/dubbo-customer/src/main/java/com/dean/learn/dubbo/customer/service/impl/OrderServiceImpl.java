package com.dean.learn.dubbo.customer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
//import com.alibaba.dubbo.config.annotation.Service;
import com.dean.learn.dubbo.api.model.UserAddress;
import com.dean.learn.dubbo.api.service.OrderService;
import com.dean.learn.dubbo.api.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


//@Service
@Component
public class OrderServiceImpl implements OrderService {

//    @Autowired
    @Reference
    UserService userService;

    public List<UserAddress> initOrder(String userId) {
        List<UserAddress> addressList = userService.getUserAddressList(userId);
//        for (UserAddress item : addressList) {
//            System.out.printf(item.getUserAddress());
//        }
        return addressList;
    }
}
