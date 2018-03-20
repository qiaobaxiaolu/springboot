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

	public User() {
		super();
	}

	public User(Integer uId, String uLoginName, String uPassword, Integer uLoginState, Integer uType) {
		super();
		this.uId = uId;
		this.uLoginName = uLoginName;
		this.uPassword = uPassword;
		this.uLoginState = uLoginState;
		this.uType = uType;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", uLoginName=" + uLoginName + ", uPassword=" + uPassword + ", uLoginState="
				+ uLoginState + ", uType=" + uType + "]";
	}

}