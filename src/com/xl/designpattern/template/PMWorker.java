package com.xl.designpattern.template;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-26
 * @description 
 * @version 1.0
 */

public class PMWorker extends Worker{

	public PMWorker(String name) {
		super(name);
	}

	@Override
	public void work() {
		System.out.println(name + "打dota...........");
	}
	
	
}

