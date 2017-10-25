package com.xl.interview;

/**
 * @author 作者:xl
 * @data   创建时间:2017-6-21
 * @description 此程序主要说明sleep和wait的区别：sleep不释放锁（其它线程只能盲等），而wait释放锁（其它线程可竞争获取锁）
 * @version 1.0
 */

public class MultiThread {
//	private static byte[] lockObj = new byte[0];
	public static void main (String[] args){
		new Thread(new Thread1()).start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Thread(new Thread2()).start();
	}
	
	private static class Thread1 implements Runnable{

		@Override
		public void run() {
			synchronized (MultiThread.class) {
				System.out.println("enter Thread1......");
				System.out.println("Thread1 is waiting............");
				test();
				try {
					MultiThread.class.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread1 is going on ......");
				System.out.println("Thread1 is being over!");
			}
		}
		
		public synchronized void test(){
			System.out.println("同步方法嵌套调用.....");
		}
		
	}
	private static class Thread2 implements Runnable{

		@Override
		public void run() {
			synchronized (MultiThread.class) {
				System.out.println("enter Thread2.....");
				System.out.println("thread2 notify other threads can release wait status...");
				MultiThread.class.notify();
				
				System.out.println( "Thread2 is sleeping ten second...");
				
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("thread2 is going on .....");
				System.out.println("thread2 is being over!");
			}
		}
		
	}
}

