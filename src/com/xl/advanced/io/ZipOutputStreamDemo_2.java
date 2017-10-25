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
 * @description 一次性压缩多个文件
 * @version 1.0
 */

public class ZipOutputStreamDemo_2 {
	public static void main(String[] args) throws Exception {
		//要被压缩的文件夹
		File file = new File("E:" + File.separator + "IO测试文件夹"+ File.separator + "temp");
		File zipFile = new File("E:" + File.separator + "IO测试文件夹" + File.separator + "zipFile.zip");
		InputStream input = null;
		ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
		zipOut.setComment("hello");
		
		if (file.isDirectory()){
			File[] files = file.listFiles();
			
			for (int i = 0; i < files.length; i++){
				input = new FileInputStream(file);
				zipOut.putNextEntry(new ZipEntry(file.getName() + File.separator + files[i].getName()));
				
				int temp = 0;
				while ((temp = input.read()) != -1){
					zipOut.write(temp);
				}
				input.close();
			}
		}
		zipOut.close();
		System.out.println("压缩文件名称：" + zipFile.getName());
	}
	
}

