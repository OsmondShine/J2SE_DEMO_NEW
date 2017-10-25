package com.xl.advanced.io_2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-6-8
 * @description 文件读写工具类
 * @version 1.0
 */

public class IOUtil {
	/*
	 * 读取指定文件内容，按照16进制输出到控制台，
	 * 并且每输出10个byte换行。
	 * 单字节读取对于大文件来说效率低下
	 */
	public static void printHex(String fileName) throws IOException{
		//把文件作为字节流进行操作
		FileInputStream in = new FileInputStream(fileName);
		int b;	//用于接收read方法返回的字节数
		int i = 1;
		while ((b = in.read()) != -1){
			if (b <= 0xf){
				//当返回的数值小于16时，单位数前面补0
				System.out.print("0");
			}
			System.out.print(Integer.toHexString(b) + "  ");
			if (i++ % 10 == 0){
				System.out.println();
			}
		}
		in.close();
	}
	/*
	 * 批量读取对于大文件而言效率高，也是我们常用的文件读取方式
	 */
	public static void printHexByByteArray(String fileName) throws IOException{
		FileInputStream in = new FileInputStream(fileName);
		byte[] buf = new byte[8 * 1024];
		
		/*从in中批量读取数据，放入到buf字节数组中
		 *从0位置开始放，最多放buf.length个
		 *返回的是读取的字节个数 
		 */
		int bytes = 0;
		int j = 1;
		while ((bytes = in.read(buf, 0, buf.length)) != -1){
			for (int i = 0; i < bytes; i++){
				if (bytes <= 0xf){
					System.out.print("0");
				}
				System.out.print(Integer.toHexString(buf[i] & 0xff) + "  ");
				if (j++ % 10 == 0){
					System.out.println();
				}
			}
		}
		in.close();
	}
	/*
	 *文件拷贝、字节批量读取 
	 */ 
	public static void copyFile(File srcFile, File destFile)throws IOException{
		if (!srcFile.exists()){
			throw new IllegalArgumentException("文件" + srcFile + "不存在");
		}
		if (!srcFile.isFile()){
			throw new IllegalArgumentException(srcFile + "不是文件");
		}
		FileInputStream in = new FileInputStream(srcFile);
		FileOutputStream out = new FileOutputStream(destFile);
		byte[] buf = new byte[8 * 1024];
		int bytes;
		while ((bytes = in.read(buf, 0, buf.length)) != -1){
			out.write(buf, 0, bytes);
			out.flush();	//最好加上
		}
		in.close();
		out.close();
	}
	/*
	 * 进行文件拷贝，使用带缓冲的字节流
	 */ 
	public static void copyFileByBuffer(File srcFile, File destFile) throws IOException{
		if (!srcFile.exists()){
			throw new IllegalArgumentException("文件：" + srcFile + "不存在");
		}
		if (!srcFile.isFile()){
			throw new IllegalArgumentException(srcFile + "不是文件");
		}
		 BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
		 BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
		 int c;
		 while ((c = bis.read()) != -1){
			 bos.write(c);
			 bos.flush();	//刷新缓冲区
		 }
		 bis.close();
		 bos.close();
	}
	/*
	 * 单字节，不带缓冲进行文件拷贝
	 */
	public static void copyFileByByte(File srcFile, File destFile)throws IOException{
		if (!srcFile.exists()){
			throw new IllegalArgumentException("文件：" + srcFile + "不存在");
		}
		if (!srcFile.exists()){
			throw new IllegalArgumentException(srcFile + "不是文件");
		}
		FileInputStream in = new FileInputStream(srcFile);
		FileOutputStream out = new FileOutputStream(destFile);
		int c;
		while ((c = in.read()) != -1){
			out.write(c);
			out.flush();
		}
		in.close();
		out.close();
	}
}

