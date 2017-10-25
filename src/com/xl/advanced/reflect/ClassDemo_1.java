package com.xl.advanced.reflect;


/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-31
 * @description 通过反射获取类的类类型的三种方法
 * @version 1.0
 */

public class ClassDemo_1 {
	public static void main(String[] args) {
		//Foo的实例对象如何表示
		Foo foo1 = new Foo();
		//Foo类也是实例对象，是Class类的实例对象
		//任何一个类都是Class的实例对象，这个实例对象有三种表示方式
		
		//1.这同时也表明任何一个类都有一个隐含的静态成员变量class
		Class c1 = Foo.class;
		
		//2.知道类对象的前提下，通过getClass方法
		Class c2 = foo1.getClass();
		
		System.out.println(c1 == c2);
		
		Class c3 = null;
		try {
			//3.通过类路径获取
			c3 = Class.forName("com.xl.advanced.reflect.User");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(c2 == c3);
		
		try {
			//通过c1、c2、c3创建Foo的实例对象
			Foo foo = (Foo)c1.newInstance();	//通过调用无参构造方法创建对象
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}
}

class Foo{
	void print(){
		System.out.println("3333333333");
	}
}
