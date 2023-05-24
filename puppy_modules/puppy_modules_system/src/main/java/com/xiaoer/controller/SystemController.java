package com.xiaoer.controller;

import com.xiaoer.domain.R;
import com.xiaoer.pojo.Login;
import com.xiaoer.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
public class SystemController {

    @Autowired
    private UserLoginService userLoginService;

    /**
     * 用户登录
     */
    @PostMapping("/login")
    public R<Object> userLogin(@RequestBody Login login){
        return userLoginService.loginUser(login.getUserName(), login.getUserPassword());
    }
}
