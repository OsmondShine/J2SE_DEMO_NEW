package com.xl.advanced.io_2;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author 作者:xl
 * @data   创建时间:2017-7-15
 * @description 
 * @version 1.0
 */

public class RafReadDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("E:\\IO测试文件夹\\学生管理RAF.txt", "r");
		raf.seek(2);
		int i = 0;
		int b = raf.read();
		System.out.println(raf.getFilePointer());
		i = i | (b << 24);
		b = raf.read();
		i = i | (b << 16);
		b = raf.read();
		i = i | (b << 8);
		b = raf.read();
		i = i | b;
		System.out.println(Integer.toHexString(i));
		raf.seek(2);
		i = raf.readInt();
		System.out.println(Integer.toHexString(i));
		raf.close();
	}
}

