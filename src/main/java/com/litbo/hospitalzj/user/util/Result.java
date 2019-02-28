package com.litbo.hospitalzj.user.util;


public class Result<T> {
    /*private String msg;
    private int state;
    private T data;*/
    private Integer state;
    private String message;
    private T data;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    //成功的时候调用此方法
    public static <T> Result<T> success(T data){
        return new Result<T>(data);
    }
    public static <T> Result<T> success(){
        return new Result<T>();
    }
    public static <T> Result<T> success(int state , String message ){
        return new Result<T>(state,message);
    }


    //失败的时候调用此方法

    public static<T>  Result<T> error(String message) {
        return new Result<>(message);
    }
    public static<T>  Result<T> error() {
        return error("error");
    }
    public static<T>  Result<T> error(int state) {
        return new Result<>(state);
    }
    public static<T>  Result<T> error(int state,String message) {
        return new Result<>(state,message);
    }



    private Result(int state,String message ){
        this.message = message;
        this.state = state;
    }
    private Result(T data){
        this.state = 200;
        this.message = "success";
        this.data = data;
    }
    private Result(){
        this.state=200;
        this.message="success";
    }

    private Result(String message){
        this.state=1;
        this.message=message;
    }
    private Result(int state){
        this.state=state;
        this.message="error";
    }

}
