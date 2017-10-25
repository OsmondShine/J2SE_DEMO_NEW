package com.xl.advanced.io_2;

import java.io.File;
import java.io.IOException;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-9
 * @description 
 * @version 1.0
 */

public class IOUtilTest {
	public static void main(String[] args) throws IOException {
//		IOUtil.printHex("E:\\学生管理.txt");
//		System.out.println("------------------------");
//		IOUtil.printHexByByteArray("E:\\学生管理.txt");
//		IOUtil.copyFile(new File("E:\\学生管理.txt"), new File("E:\\学生管理99.txt"));
		IOUtil.copyFileByBuffer(new File("E:\\学生管理.txt"), new File("E:\\学生管理99.txt"));
//		System.out.println(Integer.toBinaryString(112));
//		System.out.println(0xf);
	}
}

