package com.xiaoer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoer.pojo.PuppyMessage;
import com.xiaoer.service.PuppyMessageService;
import com.xiaoer.mapper.PuppyMessageMapper;
import org.springframework.stereotype.Service;

/**
* @author XiaoerUser
* @description 针对表【puppy_message】的数据库操作Service实现
* @createDate 2023-05-24 23:25:21
*/
@Service
public class PuppyMessageServiceImpl extends ServiceImpl<PuppyMessageMapper, PuppyMessage>
    implements PuppyMessageService{

}




