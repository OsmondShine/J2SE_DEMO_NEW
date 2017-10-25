package com.xl.basic;

import java.util.ArrayList;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-5
 * @description 
 * @version 1.0
 */

public class JustForTest {
	void m(int x){}
	void m(Number n){}
	<G extends String> void m(G g){}
	void m(ArrayList<Object> q){}
	public static int staticVar = 0;
	public int instanceVar = 0;
	
	public JustForTest(){
		staticVar ++;
		instanceVar ++;
	} 
	
	public static void main(String[] args) {
		JustForTest jst = null;
		for (int i=0; i<10; i++)
			jst = new JustForTest();
		System.out.println("staticVar: " + staticVar);
		System.out.println("instanceVar: " + jst.instanceVar);
	}
}

