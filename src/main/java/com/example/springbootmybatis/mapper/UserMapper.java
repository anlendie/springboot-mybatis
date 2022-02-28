package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.pojo.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Select("select * from user where id=#{id}")
    public User getUserById(@Param("id") Integer id);

    @Delete("delete from user where id=#{id}")
    public int deleteUserById(@Param("id") Integer id);

    @Insert("insert into user(name,age,course,fraction) values(#{name},#{age},#{course},#{fraction})")
    public int insertUser(User user);

    @Update("update user set name=#{name},age=#{age},course=#{course},fraction=#{fraction} where id=#{id}")
    public int updateUser(User user);
}
