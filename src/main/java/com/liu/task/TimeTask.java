package com.liu.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.liu.callback.TimeInfo;

import groovy.transform.builder.InitializerStrategy.SET;

/**
 * @Project Name:springboot
 * @author 刘佳瑞
 * @Package Name:com.liu.task
 * @date 2018年3月19日下午4:23:46
 */
@Component
public class TimeTask {
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	private TimeInfo timeInfo;

	public void setTimeDate(TimeInfo timeInfo) {
		this.timeInfo = timeInfo;
	}

	// 定义每过3秒执行任务
	@Scheduled(fixedRate = 1000)
	// @Scheduled(cron = "4-40 * * * * ?")
	public void reportCurrentTime() {
		String format = dateFormat.format(new Date());
		if (format.equals("15:36:10")) {
			timeInfo.getDate(format);
		}
		System.out.println("现在时间：" + dateFormat.format(new Date()));
	}
}
