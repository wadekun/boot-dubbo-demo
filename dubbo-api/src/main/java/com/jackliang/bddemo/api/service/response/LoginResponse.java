package com.jackliang.bddemo.api.service.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liangck
 * @version 1.0
 * @since 16/4/26 17:05
 */
@Data
public final class LoginResponse implements Serializable{
    public static enum LOGIN_STATUS {
        SUCC,FAIL
        ;
    }
    private LOGIN_STATUS status;
    private String msg;

    public LoginResponse(LOGIN_STATUS status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public static LoginResponse SUCCESS() {
        return new LoginResponse(LOGIN_STATUS.SUCC, null);
    }

    public static LoginResponse FAIL(String msg) {
        return new LoginResponse(LOGIN_STATUS.FAIL, msg);
    }

}
