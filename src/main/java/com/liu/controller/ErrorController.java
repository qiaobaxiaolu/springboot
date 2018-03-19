package com.liu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *@Project Name:springboot 
 * @author 刘佳瑞
 * @Package Name:com.liu.controller
 * @date 2018年3月15日下午11:05:07
 */
@Controller
@RequestMapping("err")
public class ErrorController {
	@RequestMapping("/error")
	public String error(){
		int a=1/0;
		return "thymeleaf/error";
	}
}
