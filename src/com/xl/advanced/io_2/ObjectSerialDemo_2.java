package com.xl.advanced.io_2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * @author 作者:xl
 * @data   创建时间:2017-6-29
 * @description 对象的序列化与反序列化
 * @version 1.0
 */

public class ObjectSerialDemo_2 {
	public static void main(String[] args) throws Exception{
	/*	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\IO测试文件夹\\学生管理OSD2.dat"));
		Foo foo2 = new Foo2();
		oos.writeObject(foo2);
		oos.flush();
		oos.close();*/
		
		//反序列化是否递归调用父类的构造函数
/*		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\IO测试文件夹\\学生管理OSD2.dat"));
		Foo2 foo2 = (Foo2) ois.readObject();
		System.out.println(foo2);
		ois.close();*/
		
/*		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\IO测试文件夹\\学生管理OSD3.dat"));
		Bar2 bar2 = new Bar2();
		oos.writeObject(bar2);
		oos.flush();
		oos.close();*/
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\IO测试文件夹\\学生管理OSD3.dat"));
		Bar2 bar2_2 = (Bar2) ois.readObject();
		System.out.println(bar2_2);
		ois.close();
		
		/*
		 *对子类对象进行反序列化操作时，
		 *如果父类没有实现序列化接口，
		 *那么其父类的构造函数会被调用 ；
		 *若父类实现了序列化接口，则不会被调用
		 */
	}
}

/*
 *一个类实现了序列化接口，那么其子类都可以进行序列化 
 */
class Foo implements Serializable{
	public Foo(){
		System.out.println("foo....");
	}
}
class Foo1 extends Foo{
	public Foo1(){
		System.out.println("foo1....");
	}
}
class Foo2 extends Foo1{
	public Foo2(){
		System.out.println("foo2......");
	}
}
class Bar{
	public Bar(){
		System.out.println("bar");
	}
}
class Bar1 extends Bar{
	public Bar1(){
		System.out.println("bar1....");
	}
}
class Bar2 extends Bar1 implements Serializable{
	public Bar2(){
		System.out.println("bar2.....");
	}
}