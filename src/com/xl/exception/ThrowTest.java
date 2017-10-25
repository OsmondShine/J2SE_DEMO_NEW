package com.xl.exception;

/**
 * @author 作者:xl
 * @data   创建时间:2017-8-21
 * @description 
 * @version 1.0
 */
/*
 *总结：
 *	通过throw我们可以抛出一些自己定义的异常，即可以主动触发异常 
 * 
 */
class E extends Exception{
	public E(){
		super("哈哈");	//调用父类Exception构造函数：public Exception(String message)
	}
}

public class ThrowTest {
	public static void f() throws E{
		throw new E();	//主动抛出异常
	}
	public static void main(String[] args) {
		try{
			f();
		}catch (Exception e){
			String strException = e.getMessage();
			System.out.println("strException = " + strException);
		}
		System.out.println("程序正常终止了！");
	}
}

