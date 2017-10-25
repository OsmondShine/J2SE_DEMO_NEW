package com.xl.test;

/**
 * @author 作者:xl
 * @data   创建时间:2017-6-26
 * @description 
 * @version 1.0
 */

public class SandSB {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		StringBuffer sbf = new StringBuffer();
		System.out.println(sbf);
		for (int i = 0; i < 10000; i++){
				sbf.append(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("StringBuffer运行时间：" + (endTime - startTime) + "ms");
		
		System.out.println("-----------------------------------");
		long startTime2 = System.currentTimeMillis();
		String str = new String();
		System.out.println(str);
		for (int i = 0; i < 10000; i++){
				str = str + i;
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("String运行时间：" + (endTime2 - startTime2) + "ms");
		
		System.out.println(new SandSB().test());
		System.out.println(new SandSB().get());
		System.out.println(new SandSB().test2());
}
	
@SuppressWarnings("finally")
static int test(){
	int x = 1;
	try{
		return x;
		
	}catch(Exception e){
		
	}finally{
		++ x;
		System.out.println("x的值是：" + x);
		return x;
	}
}

public int get()
{ 
try  
{ 
	System.out.println("---------");
	return 1 ;  
} 
finally
{ 
	return 2 ;  
} 
} 
int test2(){ 
	try{ 
		System.out.println("====================");
		return func1();
	} finally{ 
		return func2();
	} 
	} 
int func1() { 
	System.out.println("func1");
	return 1; 
} 
int func2(){ 
		System.out.println("func2");
		return 2; 
    }      
}


