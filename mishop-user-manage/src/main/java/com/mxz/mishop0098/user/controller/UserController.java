package com.mxz.mishop0098.user.controller;

import com.mxz.mishop0098.bean.UserInfo;
import com.mxz.mishop0098.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("findAll")
    public List<UserInfo> findAll(){
        return userService.findAll();
    }

}
