package com.nwu.performance.teacher.mapper;


import com.nwu.performance.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TeacherMapper {

    @Select("select * from user where user_number=#{user_number}")
    public User getUserBYUser_number(String user_number);

}
