package org.example.vo;

import lombok.Data;

@Data
public class Result<T> {
    private boolean success; // 成功标志
    private int code; // 状态码
    private String message; // 消息
    private T data; // 响应数据

    public static <T> Result<T> success(T data) {
        Result<T> r = new Result<T>();
        r.setMessage("操作成功");
        r.setCode(200);
        r.setSuccess(true);
        r.setData(data);
        return r;
    }

}