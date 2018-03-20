package com.liu.aspect;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @Project Name:springboot
 * @author 刘佳瑞
 * @Package Name:com.liu.aspect
 * @date 2018年3月19日下午8:32:14
 */
@Aspect
@Component
public class HttpAspect {
	private static final Logger log = LoggerFactory.getLogger(HttpAspect.class);

	@Pointcut("execution(public * com.liu.controller.*.*(..))")
	public void log() {
	}

	@After("log()")
	public void after() {
		
	}

	@Before("log()")
	public void before(JoinPoint joinPoint) {
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = attributes.getRequest();
		// url
		log.info("url={}", request.getRequestURL());
		// method
		log.info("method={}", request.getMethod());
		// ip
		log.info("ip={}", request.getRemoteAddr());
		// 类方法
		log.info("class_method={}",
				joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
		// args
		log.info("args={}", joinPoint.getArgs());
	}

	@AfterReturning(pointcut = "log()", returning = "object")
	public void doAfterReturning(Object object) {
		log.info("response={}", object.toString());
	}

}
