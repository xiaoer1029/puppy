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
    private String puppy_name;

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
    private String donate_by;

    /**
     * 捐赠时间
     */
    private Date donate_time;

    /**
     * 领养人
     */
    private String adoption_by;

    /**
     * 领养时间
     */
    private Date adoption_time;

}
