package com.xl.designpattern.simplefactory_2;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-12
 * @description 
 * @version 1.0
 */

public class Test {
	public static void main(String[] args) {
		new SimpleFactory().produceHuman(Man.class).say();
	}
}

