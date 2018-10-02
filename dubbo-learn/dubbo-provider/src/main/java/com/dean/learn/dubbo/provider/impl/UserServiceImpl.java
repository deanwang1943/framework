package com.dean.learn.dubbo.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dean.learn.dubbo.api.model.UserAddress;
import com.dean.learn.dubbo.api.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Service
@Component
public class UserServiceImpl implements UserService {
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1L, "上海市宝山", "1", "2", "Y");
        UserAddress address2 = new UserAddress(2L, "上海市浦东新区", "1", "3", "Y");
        return Arrays.asList(address1, address2);
    }
}
