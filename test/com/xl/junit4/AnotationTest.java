package com.xl.junit4;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @author 作者:xl
 * @data   创建时间:2017-7-13
 * @description 
 * @version 1.0
 */

public class AnotationTest {
	/*	3-4
	 * @Test将一个普通的方法修饰为一个测试方法
	 * 	@Test(expected = xx.class)
	 * 	@Test(timeout = 毫秒)
	 * @BeforeClass:它会在所有的方法运行前被执行，static修饰
	 * @AfterClass：它会在所有的方法运行结束后执行，static修饰
	 * @Before:它会在每一个测试方法运行前被执行一次
	 * @After:它会在每一个测试方法运行之后被执行一次
	 * @Ingore:所修饰的方法会被运行器忽略
	 * @RunWith:可以更改测试运行器
	 */
	@Test(expected = ArithmeticException.class)
	public void testDivide(){
		assertEquals(3, new Calculate().divide(6, 0));
	}
	
	@Ignore("填写忽视的原因")
	@Test(timeout = 2000)
	public void testWhile(){
		while (true) {
			System.out.println("run forever .......");
		}
	}
	
	@Test(timeout = 3000)
	public void testReadFile(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

