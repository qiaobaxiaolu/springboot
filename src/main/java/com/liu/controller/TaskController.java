package com.liu.controller;

import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liu.task.AsyncTask;
import com.liu.utils.LiuResult;

/**
 * @Project Name:springboot
 * @author 刘佳瑞
 * @Package Name:com.liu.controller
 * @date 2018年3月19日下午4:14:17
 */
@RestController
public class TaskController {
	@Autowired
	private AsyncTask asyncTask;

	@RequestMapping("/task")
	public LiuResult doTask() throws InterruptedException {
		long start = System.currentTimeMillis();
		Future<Boolean> doTask1 = asyncTask.doTask1();
		Future<Boolean> doTask2 = asyncTask.doTask2();
		Future<Boolean> doTask3 = asyncTask.doTask3();
		while (!doTask1.isDone() || !doTask2.isDone() || !doTask3.isDone()) {
			if (doTask1.isDone() || doTask2.isDone() || doTask3.isDone()) {
				break;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("总耗时" + (end - start));
		return LiuResult.ok("总耗时" + (end - start));
	}
}
