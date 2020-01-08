package com.tom.custinfosrv.common.enums;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public enum ErrorCodeEnum {

    //系統錯誤
    BUSINESS_FAIL(-1, "系統錯誤"),

    //成功返回
    RESULT_SUCCESS(200, "請求成功");

    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static String getMsg(Integer code) {
        for(ErrorCodeEnum codeEnum : ErrorCodeEnum.values()) {
            if(code == codeEnum.getCode()) {
                return codeEnum.getMsg();
            }
        }
        return "";
    }
}
