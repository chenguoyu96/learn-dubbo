package org.chenguoyu.intefaces.service;

import org.chenguoyu.intefaces.bean.UserAddress;

import java.util.List;

public interface OrderService {
    /**
     * 初始化订单
     * @param userId
     */
    List<UserAddress> initOrder(String userId);
}
