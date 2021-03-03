package com.nwu.performance.teacher.controller;


import com.nwu.performance.domain.Result;
import com.nwu.performance.domain.User;
import com.nwu.performance.teacher.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
public class TeacherController {
//@RequestParam("user_number") String user_number, String password
    @Autowired
    TeacherServiceImpl teacherService;
    @RequestMapping(value = "/teacher/login",method = RequestMethod.POST)
    public void login_teacher(Map<String,String> object){
        System.out.print(object+" ");
        /*
        User teacher = teacherService.getUserBYUser_number(user_number);
        System.out.print(teacher);
        Result result = new Result<>();
        if(teacher==null){
            result.setState(false);
            result.setMsg("没有该用户");
            return result;
        }else if(teacher.getRole()==0 && teacher.getPassword().equals(password)){
            result.setMsg("登陆成功");
            result.setState(true);
            HashMap<String,String> data = new HashMap<>();
            data.put("teacher_name",teacher.getUser_name());
            data.put("teacher_number",teacher.getUser_number());
            result.setData(data);
            System.out.print(result);
            return result;
        }else{
            result.setState(false);
            result.setMsg("登录失败");
            return result;
        }*/
    }

}
