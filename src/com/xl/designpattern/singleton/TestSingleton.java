package com.xl.designpattern.singleton;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-24
 * @description 
 * @version 1.0
 */

public class TestSingleton {
	public static void main(String[] args) {
		System.out.println(SingletonEnum.instance.method());
		System.out.println(Singleton_4.getInstance());
	}
}

