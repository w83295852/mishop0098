package com.mxz.mishop0098.user.service.impl;

import com.mxz.mishop0098.bean.UserAddress;
import com.mxz.mishop0098.bean.UserInfo;
import com.mxz.mishop0098.service.UserService;
import com.mxz.mishop0098.user.mapper.UserAddressMapper;
import com.mxz.mishop0098.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        //调用mapper
        //SELECT * FROM userAddress WHERE userId = ?;
        UserAddress userAddress = new UserAddress();
        userAddress.setId(userId);
        return userAddressMapper.select(userAddress);
    }
}
