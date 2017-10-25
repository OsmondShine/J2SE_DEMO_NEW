package com.xl.advanced.io_2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * @author 作者:xl
 * @data   创建时间:2017-7-14
 * @description 
 * @version 1.0
 */

public class RafDemo {
	public static void main(String[] args) throws IOException {
		File demo = new File("E:\\IO测试文件夹");
		if (!demo.exists()){
			demo.mkdir();
		}
		File file = new File(demo, "学生管理RAF.txt");
		if (!file.exists()){
			file.createNewFile();
		}
		
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		//指针位置
		System.out.println(raf.getFilePointer());
		
		raf.write('A');
		System.out.println(raf.getFilePointer());
		raf.write('B');
		
		int i = 0X7fffffff;
		//用write方法每次只能写一个字节，int占四个字节，所以要写四次
		raf.write(i >>>24);	//高8位
		raf.write(i >>>16);
		raf.write(i >>>8);
		raf.write(i);
		System.out.println(raf.getFilePointer());
		
		//可以直接写一个int
		raf.writeInt(i);
		
		String str = "中";
		byte[] gbk = str.getBytes("gbk");
		raf.write(gbk);
		System.out.println(raf.length());
		
		//读文件，必须将指针移到头部
		raf.seek(0);
		//一次性读取，把文件中的内容都读到字节数组中
		byte[] buf = new byte[(int)raf.length()];
		raf.read(buf);
		
		System.out.println(Arrays.toString(buf));
		for (byte b : buf){
			System.out.println(Integer.toHexString(b & 0xff) + " ");
		}
		raf.close();
	}
}

