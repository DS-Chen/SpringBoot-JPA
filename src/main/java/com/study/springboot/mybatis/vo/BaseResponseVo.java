package com.study.springboot.mybatis.vo;

import java.io.Serializable;

public class BaseResponseVo implements Serializable {

    private static final long serialVersionUID=8197244837986532584L;

    private int code; // 返回code,表示状态

    public BaseResponseVo() {

    }

    public BaseResponseVo(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
