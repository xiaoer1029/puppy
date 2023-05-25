package com.xiaoer.controller;

import com.xiaoer.domain.R;
import com.xiaoer.pojo.Login;
import com.xiaoer.pojo.dto.PuppyMessageDTO;
import com.xiaoer.service.PuppyMessageService;
import com.xiaoer.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/system")
public class SystemController {

    @Autowired
    private UserLoginService userLoginService;

    @Autowired
    private PuppyMessageService puppyMessageService;

    /**
     * 用户登录
     */
    @PostMapping("/login")
    public R<Object> userLogin(@RequestBody Login login){
        return userLoginService.loginUser(login.getUserName(), login.getUserPassword());
    }

    /**
     * 小狗捐赠
     */
    @PostMapping("/addPuppy")
    public R<Object> addPuppy(@RequestBody PuppyMessageDTO puppyMessageDTO){
        return puppyMessageService.addPuppy(puppyMessageDTO);
    }

    /**
     * 小狗领养
     */
    @PostMapping("/adoptionPuppy/{id}/{adoptionBy}")
    public R<Object> adoptionPuppy(@PathVariable Integer id, @PathVariable String adoptionBy){
        return puppyMessageService.adoptionPuppy(id,adoptionBy);
    }

    /**
     * 小狗查询
     */
    @GetMapping("/getPuppyMessage")
    public R<Object> getPuppyMessage(){
        return puppyMessageService.getAllPuppyMessage();
    }
}
