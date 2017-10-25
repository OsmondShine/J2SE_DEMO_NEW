package com.xl.xml;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

/**
 * @author 作者:xl
 * @data   创建时间:2017-8-11
 * @description 
 * @version 1.0
 */
/*
 *sax方式解析 
 */
public class SAXTest {
	public static void main(String[] args) {
		//1.获取一个SAXParserFactory的实例对象
		SAXParserFactory factory = SAXParserFactory.newInstance();
		//2.通过factory的newSAXParser()方法获取一个SAXParser类的对象
		try {
			SAXParser parser = factory.newSAXParser();
			//创建SAXParserHandler对象
			SAXParserHandler handler = new SAXParserHandler();
			parser.parse("books.xml", handler);
//			System.out.println("~~~~~~共有" + handler.getBookList().size()+"本书");
//			for (Book book : handler.getBookList()) {
//				System.out.println(book.getId());
//				System.out.println(book.getName());
//				System.out.println(book.getAuthor());
//				System.out.println(book.getYear());
//				System.out.println(book.getPrice());
//				System.out.println(book.getLanguage());
//				System.out.println("---finish---");
//			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

