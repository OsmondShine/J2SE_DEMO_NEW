package com.xl.advanced.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-8
 * @description 
 * @version 1.0
 */

public class ScannerDemo {
	public static void main(String[] args) {
		File file = new File("E:" + File.separator + "IO测试文件夹" + File.separator + "学生管理.txt");
		/*Scanner scanner = null;
		
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String str = scanner.next();
		System.out.println("从文件中读取的内容是：" + str);
	}*/
		 Scanner sca = null;  

		 try{  

			 sca = new Scanner(file);  

		 }catch(FileNotFoundException e){  

			 e.printStackTrace();  
		}  

		String str = sca.next();  

		System.out.println("从文件中读取的内容是：" + str);  

}
}

