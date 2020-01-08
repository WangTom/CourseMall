package com.tom.custinfosrv.service;

import com.tom.custinfosrv.domain.Result;
import com.tom.custinfosrv.domain.UserInfo;

public interface UserInfoService {

    Result userRegister(UserInfo userInfo);

    Result login(UserInfo userInfo);
}
