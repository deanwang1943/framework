package com.dean.learn.dubbo.api.service;

import com.dean.learn.dubbo.api.model.UserAddress;

import java.util.List;

public interface UserService {
    List<UserAddress> getUserAddressList(String userId);
}
