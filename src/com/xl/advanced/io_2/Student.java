package com.xl.advanced.io_2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author 作者:xl
 * @data   创建时间:2017-6-29
 * @description Student类，用于序列化与反序列化
 * @version 1.0
 */

public class Student implements Serializable{
	private String stuno;
	private String stuname;
	//该元素不会进行jvm默认的序列化，也可以自己完成这个元素的序列化
	private transient int stuage;
	
	public Student(String stuno, String stuname, int stuage){
		super();
		this.stuno = stuno;
		this.stuname = stuname;
		this.stuage = stuage;
	}

	public String getStuno() {
		return stuno;
	}

	public void setStuno(String stuno) {
		this.stuno = stuno;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public int getStuage() {
		return stuage;
	}

	public void setStuage(int stuage) {
		this.stuage = stuage;
	}

	@Override
	public String toString() {
		return "Student [stuno=" + stuno + ", stuname=" + stuname + ", stuage="
				+ stuage + "]";
	}
	 private void writeObject(ObjectOutputStream oos)
		        throws IOException{
		 oos.defaultWriteObject();	//把jvm能默认序列化的元素进行序列化
		 oos.writeInt(stuage);	//自己完成stuage的序列化
	 }
	 private void readObject(ObjectInputStream ois)
		        throws IOException, ClassNotFoundException{
		 ois.defaultReadObject();	//把JVM能默认反序列化的元素进行反序列化操作
		 this.stuage = ois.readInt();	//自己完成stuage的反序列化操作
	 }
}

