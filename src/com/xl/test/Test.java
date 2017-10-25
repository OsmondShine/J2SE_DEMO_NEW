package com.xl.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 作者:xl
 * @data   创建时间:2017-6-15
 * @description 
 * @version 1.0
 */
class Person{
	private static int age = 5;
	
	static class innerClass{
		public void say(){
			System.out.println("外部类的值是： " + age);
			myAge(1,1);
		}
	}
	static{
		new innerClass().say();
	}
	public void myAge(){
		System.out.println("不告诉你！" + age);
	}
	/**
	 * @return
	 */
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public void myAge(int a, String b){
		
	}
	public void myAge(String a, int b){
		
	}
	public static void myAge(int a, int b){
		System.out.println("int a, int b");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Student extends Person{
	Map<Integer,String> map = new HashMap<Integer,String>();
	
	public Student() {
		System.out.println("输出父类的类名：" + getClass().getSuperclass().getName());
	}
	@Override
	public void myAge() {
		super.myAge();
	}
	public void myAge(int a, int b, String m){
		
	}
}
public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person person = new Student();
		person.myAge();
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		
		int sum = a + b;
		
		System.out.println("a = " + a + ", b = " + b + ", sum = " + sum);
		final StringBuffer strBuf = new StringBuffer("asdaa");
		strBuf.append("hello");
		System.out.println(strBuf);
		System.out.println("============");
		System.out.println("阶乘结果是：" + f(100));
	}
	
	public static int f(int n){
		if (1 == n)
			return 1;
		else
			return f(n-1) * n;
	}
}

class Person1{
	 String name = "谢亮";
	 
	 public String getName(){
		 return name;
	 }
}

class Enterpriser extends Person1{
	@Override
	public String getName() {
		return super.getName() + "：杰出企业家";
	}
	
	public static void main(String[] args) {
		Person1 person = new Enterpriser();
		System.out.println(person.getName());
		System.out.println("====================数组测试======================");
		int[] a1 = {1,2,3,4,5};
		int[] a2;
		a2 = a1;
		for (int i = 0; i < a2.length; i++)
			a2[i] = a2[i] + 1;
		for (int i = 0; i < a1.length; i++)
			System.out.println("a1[" + i + "] = " + a1[i]);
	}
}