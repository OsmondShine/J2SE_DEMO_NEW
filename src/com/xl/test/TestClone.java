package com.xl.test;

/**
 * @author 作者:xl
 * @data   创建时间:2017-10-21
 * @description 
 * @version 1.0
 */

class Man implements Cloneable{
	private int age;
	private String name;
	
	public Man(){}
	public Man(int age,String name){
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (Man)super.clone();
	}
}
public class TestClone {
	public static void main(String[] args) throws Exception {
		Man man = new Man(21, "zhangsan");
		//引用传递
		Man man2 = man;
		Man man3 = (Man) man.clone();
		
		System.out.println(man);
		System.out.println(man2);
		System.out.println(man3);
		
		String result = man.getName() == man3.getName()
				?"clone是浅拷贝的":"clone是深拷贝的";
		System.out.println(result);
	}
}

