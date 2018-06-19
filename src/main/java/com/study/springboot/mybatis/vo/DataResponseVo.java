package com.study.springboot.mybatis.vo;

import java.io.Serializable;

public class DataResponseVo extends BaseResponseVo implements Serializable{
    private static final long serialVersionUID = 8197244837986532584L;
    private Object content;

    public DataResponseVo() {
    }

    public DataResponseVo(Object content) {
        this.content = content;
    }

    public DataResponseVo(int code, Object content) {
        super(code);
        this.content = content;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

}
