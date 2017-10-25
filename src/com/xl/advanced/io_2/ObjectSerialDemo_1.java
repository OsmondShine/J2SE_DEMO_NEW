package com.xl.advanced.io_2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


/**
 * @author 作者:xl
 * @data   创建时间:2017-6-29
 * @description 
 * @version 1.0
 */

public class ObjectSerialDemo_1 {
	public static void main(String[] args) throws Exception{
		String file = "E:\\学生管理os.txt";
		//1.对象序列化
		/*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		Student stu = new Student("001", "张三", 20);
		oos.writeObject(stu);
		oos.flush();
		oos.close();*/
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		Student stu = (Student) ois.readObject();
		System.out.println(stu);
		ois.close();
	}
}

