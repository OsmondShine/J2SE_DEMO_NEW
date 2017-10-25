package com.xl.interview;

import java.io.FileWriter;

/**
 * @author 作者:xl
 * @data   创建时间:2017-8-25
 * @description 
 * @version 1.0
 */
/*题目：
 * 	将a.txt文件中的单词与b.txt文件中的单词交替合并到c.txt文件中，
 * 	a.txt中的单词用回车符分割，b.txt中用回车或空格进行分割
 */
public class MainClass {
	public static void main(String[] args) throws Exception {
		FileManager a = new FileManager("E:\\IO测试文件夹\\a.txt", new char[]{'\n'});
		FileManager b = new FileManager("E:\\IO测试文件夹\\b.txt", new char[]{'\n',' '});
		FileWriter c = new FileWriter("E:\\IO测试文件夹\\c.txt");
		String aWord = null;
		String bWord = null;
		while ((aWord = a.nextWord()) != null){
			c.write(aWord + "\n");
			bWord = b.nextWord();
			if (bWord != null){
				c.write(bWord + "\n");
			}
		}
		while ((bWord = b.nextWord()) != null){
			c.write(bWord + "\n");
		}
		c.close(); 
	}
}

