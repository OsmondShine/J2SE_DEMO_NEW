package com.xl.designpattern.singleton_2;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-12
 * @description 内部类	优点：线程安全、延迟加载、效率高
 * @version 1.0	
 */

public class Singleton_4 {

	private Singleton_4(){}
	
	private static class SingletonHolder{
		private static Singleton_4 instance = new Singleton_4();
	}
	
	public static Singleton_4 getInstance(){
		return SingletonHolder.instance;
	}
}

