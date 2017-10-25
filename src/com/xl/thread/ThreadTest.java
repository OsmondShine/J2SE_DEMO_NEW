package com.xl.thread;

/**
 * @author 作者:xl
 * @data   创建时间:2017-6-26
 * @description 
 * @version 1.0
 */
/*
 *	子线程循环10次，接着主线程循环5次，按此顺序循环50次
 */
public class ThreadTest {
	private static boolean bShouldMain = false;
	
	public static void main(String[] args){
		//子线程
		new Thread(
			new Runnable(){
				public void run(){
					System.out.println("--------------SubThread---------------");
					for (int i = 0; i < 50; i++){
						synchronized (ThreadTest.class) {
							if (bShouldMain){
								try{
									ThreadTest.class.wait();
								}catch (Exception e) {
									e.printStackTrace();
								}
							}
							for (int j = 0; j < 10; j++){
								System.out.println(Thread.currentThread().getName() + ":i= " + i + ":j= " + j);
							}
							bShouldMain = true;
							ThreadTest.class.notify();
						}
					}
				}
			}
		).start();
		//主线程
		for (int i = 0; i < 50; i++){
			System.out.println("--------------------MainThread----------------------");
			synchronized (ThreadTest.class) {
				if (!bShouldMain){
					try{
						ThreadTest.class.wait();
					}catch (Exception e) {
						e.printStackTrace();
					}
				}
				for (int j = 0; j < 5; j++){
					System.out.println(Thread.currentThread() + ":i= " + i + ", j= " + j);
				}
				bShouldMain = false;
				ThreadTest.class.notify();
			}
		}
	}
}

