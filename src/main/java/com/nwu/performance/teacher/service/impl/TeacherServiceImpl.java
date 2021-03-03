package com.nwu.performance.teacher.service.impl;

import com.nwu.performance.domain.User;
import com.nwu.performance.teacher.dao.impl.TeacherDaoImpl;
import com.nwu.performance.teacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherDaoImpl teacherDao;


    @Override
    public User getUserBYUser_number(String user_number) {
        User user = teacherDao.getUserBYUser_number(user_number);
        return user;
    }
}
