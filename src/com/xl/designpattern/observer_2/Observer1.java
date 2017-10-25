package com.xl.designpattern.observer_2;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-12
 * @description 
 * @version 1.0
 */

public class Observer1 implements IObserver{
	private ISubject subject;
	
	public Observer1(){}
	public Observer1(ISubject subject){
		this.subject = subject;
		subject.registerObserver(this);
	}
	
	@Override
	public void update(String msg) {
		System.out.println("Observer1得到的3D彩票是：" + msg);
	}
	
}

