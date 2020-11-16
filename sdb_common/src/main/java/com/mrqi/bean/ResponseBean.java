package com.mrqi.bean;

import lombok.Data;

@Data
public class ResponseBean {
    /**
     * 200: 操作成功 -1:操作失败
     */
    private int code;

    private String msg;

    //Data
    private Object data;

    public ResponseBean() {
    }

    public ResponseBean(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    //操作失败
    private static ResponseBean erro(String messeg){
        ResponseBean responseBean = new ResponseBean();
        responseBean.setMsg(messeg);
        responseBean.setCode(-1);
        return responseBean;
    }

    private static ResponseBean erro(int code ,String messge){
        ResponseBean responseBean = new ResponseBean();
        responseBean.setMsg(messge);
        responseBean.setCode(code);
        return responseBean;
    }

    private static ResponseBean success(Object data,String messge){
        ResponseBean responseBean = new ResponseBean();
        responseBean.setMsg("成功");
        responseBean.setCode(200);
        responseBean.setData(null);
        return responseBean;
    }

    private static ResponseBean success(){
        ResponseBean responseBean = new ResponseBean();
        responseBean.setMsg("success");
        responseBean.setCode(200);
        responseBean.setData(null);
        return responseBean;
    }

}
