package org.chenguoyu.dubbo.controller;

import org.chenguoyu.intefaces.bean.UserAddress;
import org.chenguoyu.intefaces.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsumerController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam("uid") String userId) {
        return orderService.initOrder(userId);
    }


}
