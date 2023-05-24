package com.xiaoer.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* @author admin
* @description 针对表【user_login】的数据库操作Mapper
* @createDate 2023-05-22 21:52:54
* @Entity generator.domain.UserLogin
*/
@Mapper
public interface UserLoginMapper{
    /**
     * 通过用户名密码查询数据库
     */
    Integer login(@Param("userName") String userName, @Param("userPassword") String userPassword);
}




