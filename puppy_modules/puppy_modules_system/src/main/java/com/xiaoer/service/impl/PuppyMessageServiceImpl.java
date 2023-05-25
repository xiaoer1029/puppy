package com.xiaoer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoer.domain.R;
import com.xiaoer.pojo.PuppyMessage;
import com.xiaoer.pojo.dto.PuppyMessageDTO;
import com.xiaoer.service.PuppyMessageService;
import com.xiaoer.mapper.PuppyMessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author XiaoerUser
 * @description 针对表【puppy_message】的数据库操作Service实现
 * @createDate 2023-05-24 23:25:21
 */
@Service
public class PuppyMessageServiceImpl extends ServiceImpl<PuppyMessageMapper, PuppyMessage>
        implements PuppyMessageService {

    @Autowired
    private PuppyMessageMapper puppyMessageMapper;

    /*
      捐赠小狗
     */
    @Override
    public R<Object> addPuppy(PuppyMessageDTO puppyMessageDTO) {
        PuppyMessage puppyMessage = new PuppyMessage();
        puppyMessage.setPuppyName(puppyMessageDTO.getPuppyName());
        puppyMessage.setAge(puppyMessageDTO.getAge());
        puppyMessage.setHealthy(puppyMessageDTO.getHealthy());
        puppyMessage.setDonateBy(puppyMessageDTO.getDonateBy());
        puppyMessageMapper.addPuppy(puppyMessage);
        return R.ok(puppyMessage.getPuppyName());
    }

    /*
      领养小狗
    */
    @Override
    public R<Object> adoptionPuppy(Integer id, String adoptionBy) {
        if (puppyMessageMapper.adoptionPuppy(id,adoptionBy) == 1){
            return R.ok("小狗领养成功");
        }else
        return R.fail("小狗领养失败");
    }

    /*
    查询所有未领养小狗
     */
    @Override
    public R<Object> getAllPuppyMessage() {
        return R.ok(puppyMessageMapper.selectAllByAdoption());
    }


}




