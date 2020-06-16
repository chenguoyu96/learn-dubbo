package org.chenguoyu.intefaces.service;

import org.chenguoyu.intefaces.bean.UserAddress;

import java.util.List;

public interface UserService {
    /**
     * 按照用户id返回所有的收货地址
     *
     * @param userId
     * @return
     */
    List<UserAddress> getUserAddressList(String userId);
}
