package com.xiaoer.service.impl;

import com.xiaoer.domain.R;
import com.xiaoer.mapper.UserLoginMapper;
import com.xiaoer.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginServiceImpl implements UserLoginService {

    private final UserLoginMapper userLoginMapper;

    public UserLoginServiceImpl(UserLoginMapper userLoginMapper) {
        this.userLoginMapper = userLoginMapper;
    }

    /*
    登录
     */
    @Override
    public R<Object> loginUser(String userName, String userPassword) {
        if (userLoginMapper.login(userName,userPassword) == 1){
            return R.ok("登陆成功");
        }
        return R.fail("请检查用户名密码是否正确");
    }
}
