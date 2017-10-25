package com.xl.interview;

/**
 * @author 作者:xl
 * @data   创建时间:2017-10-24
 * @description 
 * @version 1.0
 */
class Person{
	private String name;
	String gender;
	
	static{
		System.out.println("我是Person静态块！");
	}
	{
		System.out.println("我是Person构造块！");
	}
	public Person(String name){
		this.name = name;
		System.out.println("我是Pesron构造函数！");
	}
}

class Man extends Person{
	private String name;
	
	static{
		System.out.println("我是Man静态块");
	}
	{
		System.out.println("我是Man构造块！");
	}
	
	public Man(String name){
		super(name);
		System.out.println("我是Man构造函数");
	}
}
public class ConstructsandStatic {
	public static void main(String[] args) {
		System.out.println(new Man("Felix").gender);
	}
}

