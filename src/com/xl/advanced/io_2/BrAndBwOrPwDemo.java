package com.xl.advanced.io_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @author 作者:xl
 * @data   创建时间:2017-6-29
 * @description 
 * @version 1.0
 */

public class BrAndBwOrPwDemo {
	public static void main(String[] args) throws IOException {
		//对文件进行读写操作
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\学生管理.txt")));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\学生管理bw.txt")));
//		PrintWriter pw = new PrintWriter(OutputStream,boolean autoFlush);
		PrintWriter pw = new PrintWriter("E:\\学生管理pw.txt");
		
		String line;
		while ((line = br.readLine()) != null){
			System.out.println(line);	//一次读一行，并不能识别换行符
			bw.write(line);
			//单独写出换行操作
			bw.newLine();	//换行操作
			bw.flush();
			pw.println(line);
			pw.flush();
		}
		br.close();
		bw.close();
		pw.close();
	}
}

