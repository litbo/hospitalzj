package com.litbo.hospitalzj.hospital.enums;


public enum EnumProcess{
    WAIT_ACCEPT(1,"待预约验收"),
    APPOINMENT_ACCEPTANCE(2,"预约验收"),
    IMPERFECT_CONTRACT_INFORMATION(3,"合同信息未完善"),
    PERFECT_INFORMATION(3,"完善资料")
    ;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    private Integer code;
    private String message;
    EnumProcess(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
