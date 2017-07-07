package com.terry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * *
 * 名称：     UserController.
 * 作者：     Terry Tan
 * 创建时间：  on 2017/7/7.
 * 说明：     
 * *
 ***/

@RestController
public class UserController {

    @Autowired
    UserAPI userAPI;

    @GetMapping("/user")
    BaseResponse getUserinfo() {
        BaseResponse response = userAPI.getUserinfo();
        response.message = "This is from eureka service consumer";
        return response;
    }

}
