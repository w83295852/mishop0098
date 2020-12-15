package com.mxz.mishop0098.order.controller;

import com.mxz.mishop0098.bean.UserAddress;
import com.mxz.mishop0098.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

//    @RequestMapping("trade")
//    public String trade(){
//        //返回视图名称index.html
//        return "index";
//    }
    @Autowired
    private UserService userService;
    @RequestMapping("trade")
    @ResponseBody  //返回json字符串，fastJson.jar    直接将数据显示到界面
    public List<UserAddress> trade(String userId){
    //返回视图名称index.html
        return userService.getUserAddressList(userId);
    }

}
