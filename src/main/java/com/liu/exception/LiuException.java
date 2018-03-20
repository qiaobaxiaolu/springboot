package com.liu.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.liu.utils.LiuResult;

/**
 * @Project Name:springboot
 * @author 刘佳瑞
 * @Package Name:com.liu.exception
 * @date 2018年3月15日下午10:52:47
 */
@ControllerAdvice
public class LiuException {
	public static final String LIU_ERROR_VIEW = "error";

	@ExceptionHandler(value = Exception.class)
	public Object errorHandler(HttpServletRequest request, HttpServletResponse response, Exception exception) {
		exception.printStackTrace();
		if (isAjax(request)) {
			return LiuResult.build(500, exception.getMessage());
		} else {
			ModelAndView andView = new ModelAndView();
			andView.addObject("url", request.getRequestURI());
			andView.addObject("exception", exception);
			andView.setViewName(LIU_ERROR_VIEW);
			return andView;
		}
	}

	/**
	 * 
	 * @Title: IMoocExceptionHandler.java
	 * @Package com.imooc.exception
	 * @Description: 判断是否是ajax请求 Copyright: Copyright (c) 2017
	 *               Company:FURUIBOKE.SCIENCE.AND.TECHNOLOGY
	 * 
	 * @author leechenxiang
	 * @date 2017年12月3日 下午1:40:39
	 * @version V1.0
	 */
	public static boolean isAjax(HttpServletRequest httpRequest) {
		return (httpRequest.getHeader("X-Requested-With") != null
				&& "XMLHttpRequest".equals(httpRequest.getHeader("X-Requested-With").toString()));
	}
}
