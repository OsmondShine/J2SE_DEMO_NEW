package com.xl.junit4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author 作者:xl
 * @data   创建时间:2017-7-13
 * @description 
 * @version 1.0
 */

public class JunitFlowTest {

	/*
	 * 1.@BeforeClass修饰的方法会在所有方法被调用前被执行，
	 *   而且由于该方法是静态的，所以当测试类被加载后接着就会运行它，
	 *   而且在内存中它只会存在一份实例，它比较适合加载配置文件。
	 * 2.@AfterClass所修饰的方法通常用来对资源进行清理，如关闭数据库连接
	 * 3.@Before和@After会在每个测试方法的前后各执行一次。
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("this is beforeClass....");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("this is AfterClass....");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("this is before....");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("this is after....");
	}

	@Test
	public void test() {
		System.out.println("this is test.......");
	}

	@Test
	public void test2(){
		System.out.println("this is test2.....");
	}
}

