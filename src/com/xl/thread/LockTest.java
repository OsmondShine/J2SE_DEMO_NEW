package com.xl.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 作者:xl
 * @data   创建时间:2017-6-26
 * @description 
 * @version 1.0
 */

public class LockTest {
	private int j;
	private Lock lock = new ReentrantLock();
	
	public static void main(String[] args) {
		LockTest lt = new LockTest();
		for (int i = 0; i < 2; i++){
			new Thread(lt.new Adder()).start();
			new Thread(lt.new Subtractor()).start();
		}
	}
	
	private class Subtractor implements Runnable{

		@Override
		public void run() {
			while (true){
			/*	synchronized (LockTest.this) {
					System.out.println("j-- = " + j--);
				}*/
				lock.lock();
				try{
					System.out.println("j-- = " + j--);
				}finally{
					lock.unlock();
				}
			}
		}
	}
	private class Adder implements Runnable{
		
		@Override
		public void run() {
			while (true){
			/*	synchronized (LockTest.this) {
					System.out.println("j++ = " + j++);
				}*/
				lock.lock();
				try{
					System.out.println("j++ = " + j++);
				}finally{
					lock.unlock();
				}
			}
		}
		
	}
}

