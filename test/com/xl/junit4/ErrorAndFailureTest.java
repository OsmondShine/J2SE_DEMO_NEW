package com.xl.junit4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author 作者:xl
 * @data   创建时间:2017-7-13
 * @description 
 * @version 1.0
 */

public class ErrorAndFailureTest {
	/* 1.Failure表示程序输出结果和预期结果不一致
	 * 2.error是由于代码异常引起的，可能是测试代码本身的错误，也可以是测试代码中的bug
	 * 3.测试用例不是用来证明你是对的，而是证明你是没有错的
	 */
	@Test
	public void testAdd(){
		assertEquals(5, new Calculate().add(3, 3));
	}
	
	@Test
	public void testDivide(){
		assertEquals(3, new Calculate().divide(6, 0));
	}
}

