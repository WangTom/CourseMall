package com.tom.custinfosrv.controller;

import com.tom.custinfosrv.domain.Result;
import com.tom.custinfosrv.domain.UserInfo;
import com.tom.custinfosrv.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @PostMapping("/userRegister")
    public Result userRegister(UserInfo userInfo) {
        return userInfoService.userRegister(userInfo);
    }

    @PostMapping("/login")
    public Result login(UserInfo userInfo) {
        return userInfoService.login(userInfo);
    }
}
