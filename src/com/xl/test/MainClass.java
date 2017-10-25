package com.xl.test;


/**
 * @author 作者:xl
 * @data   创建时间:2017-8-25
 * @description 
 * @version 1.0
 */

public class MainClass {
	public static void main(String[] args) throws Exception {
//		FileManager a = new FileManager("a.txt", new char[]{'\n'});
//		FileManager b = new FileManager("b.txt", new char[]{'\n',' '});
//		FileWriter c = new FileWriter("c.txt");
//		String aWord = null;
//		String bWord = null;
//		while ((aWord = a.nextWord()) != null){
//			c.write(aWord + "\n");
//			bWord = b.nextWord();
//			if (bWord != null){
//				c.write(bWord + "\n");
//			}
//		}
//		while ((bWord = b.nextWord()) != null){
//			c.write(bWord + "\n");
//		}
//		c.close();
		
		
		outer:for(int i = 0; i < 3; i++){
			System.out.println("outer");
			for (int j = 0; j < 4; j++){
				System.out.println("\r\n");
				break outer;
			}
		}
	}
}

