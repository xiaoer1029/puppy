package com.xiaoer.service;

import com.xiaoer.domain.R;
import com.xiaoer.pojo.PuppyMessage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoer.pojo.dto.PuppyMessageDTO;

/**
* @author XiaoerUser
* @description 针对表【puppy_message】的数据库操作Service
* @createDate 2023-05-24 23:25:21
*/
public interface PuppyMessageService extends IService<PuppyMessage> {

    /**
     * 捐赠小狗
     */
    R<Object> addPuppy(PuppyMessageDTO puppyMessageDTO);

    /**
     * 领养小狗
     */
    R<Object> adoptionPuppy(Integer id,String adoptionBy);

    /**
     * 查询所有未领养小狗
     */
    R<Object> getAllPuppyMessage();
}
