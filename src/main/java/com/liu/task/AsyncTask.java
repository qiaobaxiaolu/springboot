package com.liu.task;

import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

/**
 * @Project Name:springboot
 * @author 刘佳瑞
 * @Package Name:com.liu.task
 * @date 2018年3月19日下午3:11:36
 */

@Component
public class AsyncTask {

	@Async
	public Future<Boolean> doTask1() throws InterruptedException {
		long start = System.currentTimeMillis();
		Thread.sleep(1000);
		long end = System.currentTimeMillis();
		System.out.println("A耗时=" + (end - start));
		return new AsyncResult<Boolean>(true);
	}

	@Async
	public Future<Boolean> doTask2() throws InterruptedException {
		long start = System.currentTimeMillis();
		Thread.sleep(1000);
		long end = System.currentTimeMillis();
		System.out.println("B耗时=" + (end - start));
		return new AsyncResult<Boolean>(true);
	}

	@Async
	public Future<Boolean> doTask3() throws InterruptedException {
		long start = System.currentTimeMillis();
		Thread.sleep(1000);
		long end = System.currentTimeMillis();
		System.out.println("C耗时=" + (end - start));
		return new AsyncResult<Boolean>(true);
	}
}
