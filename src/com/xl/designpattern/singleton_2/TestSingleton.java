package com.xl.designpattern.singleton_2;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-12
 * @description 
 * @version 1.0
 */

public class TestSingleton {
	public static void main(String[] args) {
//		System.out.println("实例对象：" + Singleton_4.getInstance());
		SingletonEnum.instance.method();
	}
}

