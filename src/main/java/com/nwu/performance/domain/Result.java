package com.nwu.performance.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author wanghuan
 * @description: 这是一个返回封装类
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result<T> {
    private T data;//返回数据
    private Boolean state;//状态
    private String msg;//信息
    private int code;//状态码

    public Result() {
    }

    public Result(T data, Boolean state, String msg, int code) {
        this.data = data;
        this.state = state;
        this.msg = msg;
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Result{" +
                "data=" + data +
                ", state=" + state +
                ", msg='" + msg + '\'' +
                ", code=" + code +
                '}';
    }
}
