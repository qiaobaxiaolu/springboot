package com.liu.pojo;

public class User {
    private Integer uId;

    private String uLoginName;

    private String uPassword;

    private Integer uLoginState;

    private Integer uType;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuLoginName() {
        return uLoginName;
    }

    public void setuLoginName(String uLoginName) {
        this.uLoginName = uLoginName == null ? null : uLoginName.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public Integer getuLoginState() {
        return uLoginState;
    }

    public void setuLoginState(Integer uLoginState) {
        this.uLoginState = uLoginState;
    }

    public Integer getuType() {
        return uType;
    }

    public void setuType(Integer uType) {
        this.uType = uType;
    }
}