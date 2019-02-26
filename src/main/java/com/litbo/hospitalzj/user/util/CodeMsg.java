package com.litbo.hospitalzj.user.util;

public class CodeMsg {
    private int code;
    private String msg;

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

    public static CodeMsg getSUCCESS() {
        return SUCCESS;
    }

    public static void setSUCCESS(CodeMsg SUCCESS) {
        CodeMsg.SUCCESS = SUCCESS;
    }

    public static CodeMsg getServerError() {
        return SERVER_ERROR;
    }

    public static void setServerError(CodeMsg serverError) {
        SERVER_ERROR = serverError;
    }

    public static CodeMsg getParamError() {
        return PARAM_ERROR;
    }

    public static void setParamError(CodeMsg paramError) {
        PARAM_ERROR = paramError;
    }

    public static CodeMsg SUCCESS = new CodeMsg(0,"success");//数据返回成功
    public static CodeMsg SERVER_ERROR = new CodeMsg(500100,"服务器端异常");
    public static CodeMsg PARAM_ERROR = new CodeMsg(417100,"参数异常");
    private CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
