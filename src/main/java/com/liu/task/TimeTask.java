package com.liu.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Project Name:springboot
 * @author 刘佳瑞
 * @Package Name:com.liu.task
 * @date 2018年3月19日下午4:23:46
 */
@Component
public class TimeTask {
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	// 定义每过3秒执行任务
	@Scheduled(fixedRate = 3000)
	// @Scheduled(cron = "4-40 * * * * ?")
	public void reportCurrentTime() {
		System.out.println("现在时间：" + dateFormat.format(new Date()));
	}
}
