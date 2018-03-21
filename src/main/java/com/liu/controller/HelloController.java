package com.liu.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liu.callback.TimeInfo;
import com.liu.pojo.Me;
import com.liu.pojo.User;
import com.liu.service.UserService;
import com.liu.task.TimeTask;
import com.liu.utils.LiuResult;

/**
 * @Project Name:springboot
 * @author 刘佳瑞
 * @Package Name:com.liu.controller
 * @date 2018年3月13日下午10:35:51
 */
@RestController
public class HelloController implements TimeInfo{
	@Autowired
	private Me me;
	@Autowired
	private UserService userService;
	@Autowired
	private TimeTask timeTask;
	@RequestMapping("/hello")
	public LiuResult getName() {
		timeTask.setTimeDate(this);
		Me me1 = new Me();
		BeanUtils.copyProperties(me, me1);
		List<User> userList = userService.getName();
		return LiuResult.ok(userList);
	}
	
	@Override
	public String getDate(String date) {
		System.out.println("callback:--"+date);
		return date;
	}

	/*
	 * @Bean public StringHttpMessageConverter format(){
	 * StringHttpMessageConverter converter=new
	 * StringHttpMessageConverter(Charset.forName("UTF-8")); return converter; }
	 */
}
