package com.xl.advanced.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-8
 * @description 通过SequenceInputStream合并file1和file2到file3
 * @version 1.0
 */

public class TestSequenceInputStream {
	public static void main(String[] args) throws Exception {
		File file1 = new File("E:" + File.separator + "IO测试文件夹" + File.separator + "学生管理.txt");
		File file2 = new File("E:" + File.separator + "IO测试文件夹" + File.separator + "学生管理2.txt");
		File file3 = new File("E:" + File.separator + "IO测试文件夹" + File.separator + "学生管理3.txt");
		
		InputStream is1 = new FileInputStream(file1);
		InputStream is2 = new FileInputStream(file2);
		OutputStream os = new FileOutputStream(file3);
		//合并流
		SequenceInputStream sis = new SequenceInputStream(is1, is2);
		int temp = 0;
		while((temp = sis.read()) != -1){
			os.write(temp);
		}
		is1.close();
		is2.close();
		os.close();
		sis.close();
	}
}

