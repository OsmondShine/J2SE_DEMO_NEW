package com.xl.advanced.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-8
 * @description 
 * @version 1.0
 */

public class ZipOutputStreamDemo_1 {
	public static void main(String[] args) throws Exception {
		File file = new File("E:" + File.separator + "IO测试文件夹" + File.separator + "104_网络编程基础知识  UDP编程.avi");  
		File zipFile = new File("E:" + File.separator + "IO测试文件夹" + File.separator + "104_网络编程基础知识  UDP编程.zip");
		InputStream input = new FileInputStream(file);
		ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
		
		zipOut.putNextEntry(new ZipEntry(file.getName()));
		//设置注释
		zipOut.setComment("hello");
		int temp = 0;
		long startTime = System.currentTimeMillis();
		while((temp = input.read()) != -1){
			zipOut.write(temp);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("共耗时：" + (endTime - startTime) + "毫秒");
		input.close();
		zipOut.close();
	}
}

