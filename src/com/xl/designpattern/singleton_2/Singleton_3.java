package com.xl.designpattern.singleton_2;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-12
 * @description 懒汉式双重校验锁	优点：线程安全、延迟加载、效率较高
 * @version 1.0	
 */

public class Singleton_3 {
	private static Singleton_3 instance = null;

	private Singleton_3(){}
	
	public static Singleton_3 getInstance(){
		if (instance == null){
			synchronized (Singleton_3.class) {
				if (instance == null){
					instance = new Singleton_3();
				}
			}
		}
		return instance;
	}
}

