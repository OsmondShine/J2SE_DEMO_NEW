package com.xl.interview;

/**
 * @author 作者:xl
 * @data   创建时间:2017-6-21
 * @description 
 * @version 1.0
 */

public class Exercise {
	private int id = 1;
	private byte[] lockObj = new byte[0];
	public Exercise() {}	
	
	public void getCurrentId(){
		synchronized (lockObj) {
			System.out.println("当前id是: " + id);
			this.id++;
		}
	}
}

