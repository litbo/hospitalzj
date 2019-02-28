package com.litbo.hospitalzj.hospital.enums;


import sun.plugin2.message.Message;

public enum EnumProcess{
    WAIT_ACCEPT(1,"待预约验收"),
    APPOINMENT_ACCEPTANCE(2,"预约验收"),
    IMPERFECT_CONTRACT_INFORMATION(3,"合同信息未完善"),
    PERFECT_INFORMATION(4,"完善资料"),
    WAIT_ACCEPT_YS(5,"等待审核验收"),
    ACCEPT_OVER(6,"验收完成"),
    CONTRACT_ENTRY( 7, "合同录入"),
    REVISE_A_CONTRACT(8, "合同修改")
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
