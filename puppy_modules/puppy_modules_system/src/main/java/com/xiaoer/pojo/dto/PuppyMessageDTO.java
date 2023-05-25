package com.xiaoer.pojo.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@TableName(value ="puppy_message")
@Data
public class PuppyMessageDTO {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 小狗名字
     */
    private String puppyName;

    /**
     * 健康状况
     */
    private String healthy;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 捐赠者
     */
    private String donateBy;

    /**
     * 捐赠时间
     */
    private Date donateTime;

    /**
     * 0为未领养，1为领养
     */
    private Integer adoption;

    /**
     * 领养人
     */
    private String adoptionBy;

    /**
     * 领养时间
     */
    private Date adoptionTime;

}
