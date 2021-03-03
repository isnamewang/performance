package com.nwu.performance.domain;

import org.omg.CORBA.INTERNAL;

public class User {

        //主键id
        private Integer id;
        //用户姓名
        private String user_name;
        //工号
        private String user_number;
        //密码
        private String password;
        //角色
        private Integer role;

        public String getUser_name() {
                return user_name;
        }

        public void setUser_name(String user_name) {
                this.user_name = user_name;
        }

        public String getUser_number() {
                return user_number;
        }

        public void setUser_number(String user_number) {
                this.user_number = user_number;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public Integer getRole() {
                return role;
        }

        public void setRole(Integer role) {
                this.role = role;
        }

        @Override
        public String toString() {
                return "User{" +
                        "id=" + id +
                        ", user_name='" + user_name + '\'' +
                        ", user_number='" + user_number + '\'' +
                        ", password='" + password + '\'' +
                        ", role=" + role +
                        '}';
        }
}
