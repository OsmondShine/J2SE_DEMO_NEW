package com.xl.advanced.io_2;

import java.io.File;
import java.io.FileFilter;

/**
 * @author 作者:xl
 * @data   创建时间:2017-6-29
 * @description 列出指定文件夹下的所有文件
 * @version 1.0
 */

public class FileDemo_2 {
	public static void main(String[] args) {
		File file = new File("E:\\IO测试文件夹");
		
		File[] files = file.listFiles(new FileFilter(){
			@Override
			public boolean accept(File pathname) {
				System.out.println(pathname);
				
				return false;
			}
		});
	}
}

