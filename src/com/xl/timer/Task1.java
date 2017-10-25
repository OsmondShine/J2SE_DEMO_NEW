package com.xl.timer;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-14
 * @description 使用线程休眠达到定时任务的效果(最常见)
 * @version 1.0
 */

public class Task1 {
	public static void main(String[] args) {
		final long timeInterval = 1000;
		Runnable runnable = new Runnable(){
			@Override
			public void run() {
				while (true){
					System.out.println("我是定时任务，我每隔一秒输出一次！");
					
					try {
						Thread.sleep(timeInterval);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
    }  
}

