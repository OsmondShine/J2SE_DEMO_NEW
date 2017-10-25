package com.xl.designpattern.observer_2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-12
 * @description 
 * @version 1.0
 */

public class SubjectFor3D implements ISubject{
	private List<IObserver> observers = new ArrayList<IObserver>();
	private String msg;
	
	@Override
	public void registerObserver(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void removeObsever(IObserver observer) {
		int index = observers.indexOf(observer);
		if (index >= 0){
			observers.remove(index);
		}
	}

	@Override
	public void notifyObserver() {
		for (IObserver observer: observers){
			 observer.update(msg);
		}
	}

	@Override
	public void setMsg(String msg) {
		this.msg = msg;
		notifyObserver();
	}
}

