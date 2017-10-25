package com.xl.junit4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author 作者:xl
 * @data   创建时间:2017-7-13
 * @description 
 * @version 1.0
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TaskTest1.class, TaskTest2.class, TaskTest3.class})
public class SuiteTest {
	/*
	 * 1.测试套件就是组织测试类一起运行的
	 * 
	 * 写一个作为测试套件的入口类，这个类不包含其它的方法
	 * 更改测试运行器的Suite.class
	 * 将要测试的类作为数组传入到Suite.SuiteClasses({})
	 * 
	 * 
	 */
}

