package com.xl.designpattern.observer_2;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-12
 * @description 
 * @version 1.0
 */

public class Test {
	public static void main(String[] args) {
		SubjectFor3D subject = new SubjectFor3D();
		
		IObserver observer1 = new Observer1(subject);
		IObserver observer2 = new Observer2(subject);
		
		subject.setMsg("20140420的3D号码是：127");
		subject.setMsg("20140421的3D号码是：128");
	}
}

