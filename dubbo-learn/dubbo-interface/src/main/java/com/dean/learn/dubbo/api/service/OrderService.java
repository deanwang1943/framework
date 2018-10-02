package com.dean.learn.dubbo.api.service;

import com.dean.learn.dubbo.api.model.UserAddress;

import java.util.List;

public interface OrderService {
    List<UserAddress> initOrder(String userId);
}
