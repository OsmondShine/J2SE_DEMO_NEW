package com.xl.designpattern.abstractfactory_3;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-12
 * @description 
 * @version 1.0
 */

public class LowPersonFactory implements IAbstractFactory{

	@Override
	public IVehicle getVehicle() {
		return new Bike();
	}
}

