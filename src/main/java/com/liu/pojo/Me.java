package com.liu.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Project Name:springboot
 * @author 刘佳瑞
 * @Package Name:com.liu.pojo
 * @date 2018年3月14日下午11:02:25
 */
@Configuration
@ConfigurationProperties(prefix = "com.liu")
@PropertySource(value = "classpath:resource.properties")
public class Me {
	private String name;
	private String password;

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

}
