package com.xl.interview;

import java.io.File;
import java.io.FileReader;

/**
 * @author 作者:xl
 * @data   创建时间:2017-8-25
 * @description 
 * @version 1.0
 */

public class FileManager {
	String[] words = null;
	int pos = 0;

	public FileManager(String filename, char[] seperators) throws Exception{
		File f = new File(filename);
		FileReader reader = new FileReader(f);
		char[] buf = new char[(int)f.length()];
		int len = reader.read(buf);
		String results = new String(buf, 0, len); 
		String regex = null;
		
		if (seperators.length > 1){
			regex = "" + seperators[0] + "|"+ seperators[1];
		}else{
			regex = "" + seperators[0];
		}
		words = results.split(regex);
	}
	
	public String nextWord(){
		if (pos == words.length)
			return null;
		return words[pos++];
	}
	
}

