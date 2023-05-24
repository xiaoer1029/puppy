package com.xiaoer.service;


import com.xiaoer.domain.R;

public interface UserLoginService {
    /**
     * 登录
     */
    R<Object> loginUser(String userName, String userPassword);
}
