package com.xl.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 作者:xl
 * @data   创建时间:2017-6-15
 * @description 
 * @version 1.0
 */

public class TestThreadPool {
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 10; i++){
			pool.execute(new Runnable(){
				@Override
				public void run() {
					System.out.println("线程池创建线程......");
				}
			});
		}
		
	}
}

