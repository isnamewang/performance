package com.nwu.performance.teacher.dao.impl;


import com.nwu.performance.domain.User;
import com.nwu.performance.teacher.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherDaoImpl implements TeacherMapper {

    @Autowired
    TeacherMapper teacherMapper;


    @Override
    public User getUserBYUser_number(String user_number) {
        return teacherMapper.getUserBYUser_number(user_number);
    }
}
