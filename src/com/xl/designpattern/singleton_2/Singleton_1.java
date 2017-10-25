package com.xl.designpattern.singleton_2;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-12
 * @description 饿汉式1(所谓饿汉式：即在类加载时就创建对象)
 * @version 1.0
 */

public class Singleton_1 {
	private static final Singleton_1 instance = new Singleton_1();
	
	private Singleton_1(){}
	
	public static Singleton_1 getInstance(){
		return instance;
	}
}

