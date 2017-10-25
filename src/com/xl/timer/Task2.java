package com.xl.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author 作者:xl
 * @data   创建时间:2017-6-14
 * @description 
 * @version 1.0
 */
/*	总结：相比于前一种方式的优势
 * 		1.第一次启动时间可控。
 * 				
 * 在实现时，Timer类可以调度任务，TimerTask则是通过在run()方法里执行具体任务。
 * Timer实例可以调度多任务，他是线程安全的，当Timer的构造器被调用时，它创建了一个线程用于调度任务。
 * 
 */
public class Task2 {
	public static void main(String[] args) {
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("定时任务，三秒一次！");
			}
		};
		Timer timer = new Timer();
		int delay = 5000;	//第一次启动延迟时间
		long intervalPeriod = 3 * 1000;	//定时任务间隔周期
		timer.scheduleAtFixedRate(task, delay, intervalPeriod);
	}
}

