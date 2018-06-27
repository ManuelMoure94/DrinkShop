package com.manuelmoure.drinkshop.api.models;

import java.lang.ref.SoftReference;

/**
 * Created by ManuelMoure on 26/06/2018.
 */

public class UserRegisterResponse {

    private boolean exists;
    private String errorMsg;

    public UserRegisterResponse() {
    }

    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
