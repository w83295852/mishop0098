package com.mxz.mishop0098.service;

import com.mxz.mishop0098.bean.UserAddress;
import com.mxz.mishop0098.bean.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    /**
     * 查询所有数据
     * @return
     */
    List<UserInfo> findAll();

    /**
     * 根据用户ID查询用户地址列表
     * @param userId
     * @return
     */
    List<UserAddress> getUserAddressList(String userId);

}
