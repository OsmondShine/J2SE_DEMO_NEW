package com.xl.advanced.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-31
 * @description 反射工具类
 * @version 1.0
 */

public class ClassUtil {
	/** 
	 * 打印类的信息，包括类的成员函数、成员变量
	 * @param obj 该对象所属类的信息
	 */
	public static void printClassMasage(Object obj) {
		//要获取类的信息，首先获得类的类类型
		Class c = obj.getClass();	//传递的是哪个子类的对象 c就是该子类的类类型
		//获取类的名称
		System.out.println("类的名称是：" + c.getName());
		
		/*
		 * Method类，方法对象
		 * 一个成员方法就是一个Method对象
		 * getMethods()方法获取的是所有public的方法，包括从父类继承而来的
		 * getDeclaredMethods()获取的是所有该类自己声明的方法，不问访问权限
		 * */
		Method[] ms = c.getMethods();	//c.getDeclaredMethods()
		for (int i = 0; i < ms.length; i++){
			//得到方法返回值类型的类类型
			Class returnType = ms[i].getReturnType();
			System.out.print(returnType.getName() + " ");
			//得到方法的名称
			System.out.print(ms[i].getName() + "(");
			//获取参数类型---->得到的是参数列表的类型的类类型
			Class[] paramTypes = ms[i].getParameterTypes();
			for (Class class1 : paramTypes) {
				System.out.print(class1.getName() + ",");
			}
			System.out.println(")");
		}
	}
	/*
	 * 获取成员变量的信息
	 * @param obj
	 * */
	public static void printFieldMessage(Object obj){
		Class c = obj.getClass();
		/*
		 * 成员变量也是对象是java.lang.reflect.Field的实例对象
		 * Field类封装了关于成员变量的操作
		 * getFields()方法获取的是所有public的成员变量的信息
		 * getDeclaredFields()获取的是自己声明的成员变量的信息
		 * */
//		Field[] fs = c.getFields();
		Field[] fs = c.getDeclaredFields();
		for (Field field : fs) {
			//得到成员变量类型的类类型
			Class fieType = field.getType();
			String typeName = fieType.getName();
			//得到成员变量的名称
			String fieldName = field.getName();
			System.out.println(typeName + " " + fieldName);
		}
	}
	/*
	 * 打印对象的构造函数信息
	 */
	public static void printConMessage(Object obj) {
		//1.获取类类型
		Class c = obj.getClass();
		/*
		 *构造函数也是对象
		 *java.lang.Constructor中封装了构造函数的信息
		 * getConstructors()获取类中所有的public方法
		 * getDeclaredConstructors()获取类中自己声明的方法
		 */
//		Constructor[] cs = c.getConstructors();
		//2.获取本类中声明的构造函数
		Constructor[] cs = c.getDeclaredConstructors();
		for (Constructor constructor : cs) {
			//3.获取构造函数方法名
			String conName = constructor.getName();
			//4.获取构造函数参数类型的类类型
			Class[] paramType = constructor.getParameterTypes();
			System.out.print(conName + "(");
			for (Class class1 : paramType) {
				System.out.print(class1.getName() + ", ");
			}
			System.out.println(")");
		}
	}
}

