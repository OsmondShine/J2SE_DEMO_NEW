package com.xl.advanced.reflect;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-31
 * @description 
 * @version 1.0
 */

public class ClassDemo_2 {
	public static void main(String[] args) {
		
		Class c1 = int.class;	//int的类类型
		Class c2 = String.class;
		Class c3 = double.class;
		Class c4 = Double.class;
		Class c5 = void.class;
		
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c2.getSimpleName());	//不包含包名的类名称
		System.out.println(c5.getName());
	}
}

