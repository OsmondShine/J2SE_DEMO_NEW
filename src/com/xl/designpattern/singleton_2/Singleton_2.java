package com.xl.designpattern.singleton_2;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-12
 * @description 饿汉式2()
 * @version 1.0
 */

public class Singleton_2 {
	private static Singleton_2 instance = null;
	
	static{
		instance = new Singleton_2(); 
	}
	
	private Singleton_2(){}
	
	public Singleton_2 getInstance(){
		return instance;
	}
}

