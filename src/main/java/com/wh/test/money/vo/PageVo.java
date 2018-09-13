package com.wh.test.money.vo;

import java.util.List;

/**
 * @ClassName PageVo
 * @AuthorAdministrator
 * @Date2018/9/13 0013 16:58
 **/
public class PageVo<T> {
    private int code;

    private String msg;

    private int count;

    private List<T> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public PageVo() {};

    public PageVo(int code, String msg, int count, List<T> data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public PageVo(int count, List<T> data) {
        this.code=0;
        this.msg="成功";
        this.count=count;
        this.data=data;
    }
}
