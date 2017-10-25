package com.imooc.proxy;
/*	总结：
 * 	动态代理实现思路：
 * 		实现功能：通过Proxy的newProxyInstance返回代理对象
 * 				1.声明一段源码(动态产生代理)
 * 				2.编译源码(JDK Compiler API)，产生新的类(代理类)
 * 				3.将这个类load到内存中，产生一个新的类(代理类)
 * 				4.return 代理对象
 */
public class Client {

	/**
	 * 测试类
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		Moveable m = (Moveable)Proxy.newProxyInstance(Moveable.class,h);
		m.move();
	}

}