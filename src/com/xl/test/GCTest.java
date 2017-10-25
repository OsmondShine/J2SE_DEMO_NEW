package com.xl.test;

import java.io.IOException;

/**
 * @author 作者:xl
 * @data   创建时间:2017-8-24
 * @description 
 * @version 1.0
 */

public class GCTest {
	public static void main(String[] args) throws IOException {
		try{
			gcTest();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("has exited gcTest!");
		System.in.read();
		System.in.read();
		System.out.println("out begingc!");
		
		for (int i = 0; i < 100; i++){
			System.gc();
			System.in.read();
			System.in.read();
		}
	}
	
	private static void gcTest() throws Exception{
		System.in.read();
		System.in.read();
		Person p1 = new Person();
		System.in.read();
		System.in.read();
		Person p2 = new Person();
	}
	
	private static class Person{
		byte[] data = new byte[2000000];
		Person mate = null;
		
		public void setMate(Person mate){
			this.mate = mate;
		}
	}
}

