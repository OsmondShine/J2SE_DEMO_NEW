package com.xl.timer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;



/**
 * @author 作者:xl
 * @data   创建时间:2017-6-14
 * @description 
 * @version 1.0
 */
/*	总结：
 * 		ScheduledExecutorService是从java SE5的java.util.concurrent里，作为并发工具类被引进的，是最理想的定时任务实现方式
 * 		相比于前两种方法，优势有：
 * 			1.相比于Timer的单线程，它是通过线程池来执行任务的。
 * 			2.可以很灵活的去设定第一次执行任务的delay时间
 * 			3.提供了良好的约定，以便于设定执行的时间间隔
 */
public class Task3 {
	public static void main(String[] args) {
		Runnable runnable = new Runnable(){
			@Override
			public void run() {
				System.out.println("定时任务");
			}
		};
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.scheduleAtFixedRate(runnable, 10, 1, TimeUnit.SECONDS);
	}
}

