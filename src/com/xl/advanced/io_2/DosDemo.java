package com.xl.advanced.io_2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 作者:xl
 * @data   创建时间:2017-6-29
 * @description 
 * @version 1.0
 */

public class DosDemo {
	public static void main(String[] args) throws IOException {
		String file = "demo/dos.dat";
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
		
		dos.writeInt(10);
		dos.writeInt(-10);
		dos.writeLong(101);
		dos.writeDouble(10.5);
		//采用UTF-8编码写出
		dos.writeUTF("中国");
		//采用UTF-16BE编码写出
		dos.writeChars("中国");
		dos.close();
		IOUtil.printHex(file);
	}
}

