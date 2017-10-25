package com.xl.threadpool;

/**
 * @author 作者:xl
 * @data   创建时间:2017-6-19
 * @description 线程池测试类
 * @version 1.0
 */

public class TestThreadPool {
	public static void main(String[] args) {
		//创建三个线程的线程池
		ThreadPool t = ThreadPool.getThreadPool(3);
		t.excute(new Runnable[]{new Task(), new Task(), new Task()});
		t.excute(new Runnable[]{new Task(), new Task(), new Task()});
		System.out.println(t);
		t.destory();	//所有线程都执行完才destory
		System.out.println(t);
	}
	
	//任务类
	static class Task implements Runnable{
		private static volatile int i = 1;
		
		@Override
		public void run() {	//执行任务
			System.out.println("任务" + (i++) + "完成");
		}
	}
}

