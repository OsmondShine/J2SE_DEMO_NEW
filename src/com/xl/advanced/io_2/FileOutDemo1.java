package com.xl.advanced.io_2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 作者:xl
 * @data   创建时间:2017-6-29
 * @description 
 * @version 1.0
 */

public class FileOutDemo1 {
	public static void main(String[] args) throws IOException {
		
		//如果该文件不存在，则直接创建，若存在，删除后创建
		FileOutputStream out = new FileOutputStream(new File("demo/out.dat"));
		out.write('A');	//写出了A的低八位
		out.write('B');	//写出了B的低八位
		int a = 10;	//write只能写八位，那么写一个int需要写4次，每次8位(out是字节流，一次只能写一个字节，int数据类型占4个字节，所以必须分四次写入)
		out.write(a >>> 24);
		out.write(a >>> 16);
		out.write(a >>> 8);
		byte[] gbk = "中国".getBytes("gbk");
		out.write(gbk);
		out.close();
		
		IOUtil.printHex("demo/out.dat");
	}
}

