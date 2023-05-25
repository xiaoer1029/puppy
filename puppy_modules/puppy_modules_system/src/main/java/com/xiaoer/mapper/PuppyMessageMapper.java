package com.xiaoer.mapper;

import com.xiaoer.pojo.PuppyMessage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author XiaoerUser
* @description 针对表【puppy_message】的数据库操作Mapper
* @createDate 2023-05-24 23:25:21
* @Entity generator.pojo.PuppyMessage
*/
@Mapper
public interface PuppyMessageMapper extends BaseMapper<PuppyMessage> {
    /**
     * 小狗捐赠
     */
    Integer addPuppy(PuppyMessage puppyMessage);

    /**
     * 领养小狗
     */
    Integer adoptionPuppy(@Param("id") Integer id, @Param("adoptionBy") String adoptionBy);

    /**
     * 查询未领养小狗信息
     */
    List<PuppyMessage> selectAllByAdoption();

}




