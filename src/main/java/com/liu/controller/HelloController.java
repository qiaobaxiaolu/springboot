package com.liu.controller;

import java.nio.charset.Charset;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liu.pojo.Me;
import com.liu.pojo.User;
import com.liu.pojo.User1;
import com.liu.service.UserService;
import com.liu.utils.LiuResult;

/**
 * @Project Name:springboot
 * @author 刘佳瑞
 * @Package Name:com.liu.controller
 * @date 2018年3月13日下午10:35:51
 */
@RestController
public class HelloController {
	@Autowired
	private Me me;
	@Autowired
	private UserService userService;

	@RequestMapping("/hello")
	public LiuResult getName() {
		Me me1 = new Me();
		BeanUtils.copyProperties(me, me1);
		List<User> userList = userService.getName();
		return LiuResult.ok(userList);
	}

	/*
	 * @Bean public StringHttpMessageConverter format(){
	 * StringHttpMessageConverter converter=new
	 * StringHttpMessageConverter(Charset.forName("UTF-8")); return converter; }
	 */
}
