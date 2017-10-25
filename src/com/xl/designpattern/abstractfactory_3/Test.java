package com.xl.designpattern.abstractfactory_3;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-12
 * @description 
 * @version 1.0
 */

public class Test {
	public static void main(String[] args) {
		IAbstractFactory factory = new HighPersonFactory();
		IVehicle vehicle =  factory.getVehicle();
		vehicle.goToWork();
		
		IAbstractFactory factory_2 = new LowPersonFactory();
		vehicle = factory_2.getVehicle();
		vehicle.goToWork();
	}
}

