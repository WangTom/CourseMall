package com.tom.custinfosrv.service.impl;

import com.tom.custinfosrv.domain.Result;
import com.tom.custinfosrv.domain.UserInfo;
import com.tom.custinfosrv.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Override
    public Result userRegister(UserInfo userInfo) {
        try {
            log.info("用户注册");

        } catch (Exception e) {
            log.error("用户注册失败", e);
        }
        return null;
    }

    @Override
    public Result login(UserInfo userInfo) {
        return null;
    }
}
