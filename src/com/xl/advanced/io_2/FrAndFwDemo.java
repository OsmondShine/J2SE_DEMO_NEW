package com.xl.advanced.io_2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 作者:xl
 * @data   创建时间:2017-6-29
 * @description 
 * @version 1.0
 */

public class FrAndFwDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("E:\\学生管理2.txt");
		FileWriter fw = new FileWriter("E:\\学生管理FrAndFw.txt");
		
		char[] buffer = new char[2056];
		int c; 
		while ((c = fr.read(buffer, 0, buffer.length)) != -1){
			fw.write(buffer, 0, c);
			fw.flush();
		}
		fr.close();
		fw.close();
	}
}

