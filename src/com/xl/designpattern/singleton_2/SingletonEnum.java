package com.xl.designpattern.singleton_2;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-12
 * @description 
 * @version 1.0
 */
public enum SingletonEnum {
	instance;
	
	public void method() {
		System.out.println("创建的实例是：" + instance);
	}
}

