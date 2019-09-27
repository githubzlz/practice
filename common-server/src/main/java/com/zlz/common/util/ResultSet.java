package com.zlz.common.util;

/**
 * @author zhulinzhong
 * @version 1.0 createTime:2019/9/27 10:42
 */
public class ResultSet {

    private Integer code;
    private String message;
    private Object data;

    public ResultSet() {
    }

    public ResultSet(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResultSet(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static ResultSet success(String message){
        return new ResultSet(1, message);
    }

    public static ResultSet success(String message, Object data){
        return new ResultSet(1, message, data);
    }

    public static ResultSet error(String message){
        return new ResultSet(-1, message);
    }

    public static ResultSet error(String message, Object data){
        return new ResultSet(-1, message, data);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
