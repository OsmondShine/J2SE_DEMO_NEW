package com.xl.advanced.io_2;

import java.io.File;
import java.io.IOException;

/**
 * @author 作者:xl
 * @data   创建时间:2017-6-29
 * @description 
 * @version 1.0
 */

public class FileDemo {
	public static void main(String[] args) {
		//了解构造函数情况 查API
		File file = new File("E:\\学生管理");
		if (!file.exists()){
			//创建目录
			file.mkdir();
		}else{
			//删除目录
			file.delete();
			System.out.println("文件是否存在：" + file.exists());
		}
		//是否是一个目录 如果是返回true,如果不是目录或目录不存在返回false
		System.out.println("文件是否是一个目录：" + file.isDirectory());
		//是否是一个文本
		System.out.println("文件是否是一个文件：" + file.isFile());
		 
		File file2 = new File("E:\\IO测试文件夹\\学生管理2.txt");
		if (!file2.exists()){
			try {
				file2.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else{
			file2.delete();
		}
		System.out.println("------------------------");
		//常用File对象的API
		System.out.println("file2 : " + file2);	//file.toString()的内容
		System.out.println("file2.getAbsolutePath() : " + file2.getAbsolutePath());
		System.out.println("file.getName() : " + file.getName());
		System.out.println("file2.getName() : " + file2.getName());
		System.out.println("file.getParent() ： " + file.getParent());
		System.out.println("file2.getParent() : " + file2.getParent());
		System.out.println("file2.getParentFile().getAbsolutePath() : " + file2.getParentFile().getAbsolutePath());
	}
}

