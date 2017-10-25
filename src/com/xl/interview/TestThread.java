package com.xl.interview;

/**
 * @author 作者:xl
 * @data   创建时间:2017-6-21
 * @description 用一个类(包含id)实现一个对象可以被多个的线程并发访问，同时实现id的累加输出
 * @version 1.0
 */

public class TestThread implements Runnable{
	private Exercise ex = new Exercise();
	
	@Override
	public void run() {
		ex.getCurrentId();
	}
	
	public static void main(String[] args) {
		Runnable tt_1 = new TestThread();
		while (true){
			new Thread(tt_1).start();
		}
	}
}

