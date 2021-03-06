package top.ycshang.myblog.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: myblog
 * @description: 响应结果封装类：暂时用0表示成功，-1表示失败
 * @author: ycshang
 * @create: 2021-12-07 15:13
 **/
@Data
public class ResponseResult implements Serializable {
    private Integer code;
    private String msg;
    private Object data;

    public static ResponseResult success(Object data) {
        ResponseResult m = new ResponseResult();
        m.setCode(0);
        m.setData(data);
        m.setMsg("操作成功");
        return m;
    }

    public static ResponseResult success(String mess, Object data) {
        ResponseResult m = new ResponseResult();
        m.setCode(0);
        m.setData(data);
        m.setMsg(mess);
        return m;
    }

    public static ResponseResult fail(String mess) {
        ResponseResult m = new ResponseResult();
        m.setCode(-1);
        m.setData(null);
        m.setMsg(mess);
        return m;
    }

    public static ResponseResult fail(String mess, Object data) {
        ResponseResult m = new ResponseResult();
        m.setCode(-1);
        m.setData(data);
        m.setMsg(mess);
        return m;
    }
}