package com.xl.designpattern.simplefactory_2;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-12
 * @description 
 * @version 1.0
 */

public class SimpleFactory {
	public static IHuman produceHuman(Class<?> c){
		IHuman human = null;
		try {
			human = (IHuman)Class.forName(c.getName()).newInstance();
		} catch (InstantiationException e) {
			System.out.println("接口或抽象类不能实例化！");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			System.out.println("非法访问！");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("无法找到指定类！");
			e.printStackTrace();
		}
		return human;
	}
}

