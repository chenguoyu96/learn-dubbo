package org.chenguoyu.dubbo.service;


import org.apache.dubbo.config.annotation.DubboReference;
import org.chenguoyu.intefaces.bean.UserAddress;
import org.chenguoyu.intefaces.service.OrderService;
import org.chenguoyu.intefaces.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @DubboReference
    private UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户ID："+userId);
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        return userAddressList;
    }
}
