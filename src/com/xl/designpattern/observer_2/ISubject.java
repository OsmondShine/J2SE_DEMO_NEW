package com.xl.designpattern.observer_2;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-12
 * @description 
 * @version 1.0
 */

public interface ISubject {
	public void registerObserver(IObserver observer);
	
	public void removeObsever(IObserver observer);
	
	public void notifyObserver();
	
	public void setMsg(String msg);
}

