package com.xl.advanced.io_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-9
 * @description 
 * @version 1.0
 */

public class IsrAndOswDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("E:\\学生管理.txt");
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");	//默认项目的编码，操作的时候，要写文件本身的编码格式
		
		FileOutputStream out = new FileOutputStream("E:\\学生管理88.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");	//指定编码格式
		
		char[] buffer = new char[8 * 1024];
		int c;
		/*批量读取，放入buffer这个字符数组，从第0个位置开始放，最多放buffer.length个元素
		 * 返回的是读到的字符个数
		 */
		while ((c = isr.read(buffer, 0, buffer.length)) != -1){
			String s = new String(buffer, 0, c);
			System.out.print(s);
			osw.write(buffer, 0, c);
			osw.flush();
		}
		isr.close();
		osw.close();
	}
}

