package com.liu.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 *@Project Name:springboot 
 * @author 刘佳瑞
 * @Package Name:com.liu.pojo
 * @date 2018年3月14日下午10:33:43
 */

public class User1 {
	private String name;
	private int age;
	@JsonIgnore
	private String password;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	@JsonInclude(Include.NON_NULL)
	private String desc;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
