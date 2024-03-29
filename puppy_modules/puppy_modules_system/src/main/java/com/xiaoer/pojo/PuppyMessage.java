package com.xiaoer.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @TableName puppy_message
 */
@TableName(value ="puppy_message")
@Data
public class PuppyMessage implements Serializable {
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
    private String donateTime;

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
    private String adoptionTime;

}
