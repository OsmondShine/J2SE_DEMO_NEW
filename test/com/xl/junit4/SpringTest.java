package com.xl.junit4;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 作者:xl
 * @data   创建时间:2017-7-13
 * @description 
 * @version 1.0
 */

public class SpringTest {
	private static ApplicationContext context = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(context);
	}
	
	@Test
	public void test(){
		Date date = (Date) context.getBean("date");
		System.out.println(date);
	}
}

