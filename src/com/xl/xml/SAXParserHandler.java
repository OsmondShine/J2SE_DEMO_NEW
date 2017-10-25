package com.xl.xml;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @author 作者:xl
 * @data   创建时间:2017-8-11
 * @description 
 * @version 1.0
 */

public class SAXParserHandler extends DefaultHandler{
	/*注意DefaultHandler是org.xml.sax.helpers包下的*/
	
	int bookIndex = 0;
	
	String value = null;
	Book book = null;
	private ArrayList<Book> bookList = new ArrayList<Book>();	//保存book对象

	public ArrayList<Book> getBookList() {
		return bookList;
	}
	
	/*
	 *用来标识解析开始 
	 */
	@Override
	public void startDocument() throws SAXException{
		super.startDocument();
		System.out.println("SAX解析开始");
	}

	/*
	 *用来遍历xml文件的开始标签 
	 *解析xml元素
	 */
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		//调用DefaultHandler类的startElement方法
		super.startElement(uri, localName, qName, attributes);
		if (qName.equals("book")){
			bookIndex++;
			//创建一个book对象
			book = new Book();
			//开始解析book元素的属性
			System.out.println("===========开始遍历第" + bookIndex + "本书的内容===========");
			/*//注： 已知节点属性名时：比如已知id属性，根据属性名称获取属性值
			 * 	String value = attributes.getValue("id");
			 * 	System.out.println("book的属性值是：" + value);
			 */
			//注：未知节点的属性名时，获取属性名和属性值
			int num = attributes.getLength();
			for (int i = 0; i < num; i++){
				System.out.println("book元素的第" + (i+1) + "个属性名是：" + attributes.getQName(i));
				System.out.println("----属性值是：" + attributes.getValue(i));
				if (attributes.getQName(i).equals("id")){
					//向book中的对象设值
					book.setId(attributes.getValue(i));
				}
			}
		}else if (!qName.equals("book") && !qName.equals("bookstore")) {
			System.out.println("节点名是：" + qName + "---");//此时qName获取的是节点名(标签)
		}
	}
	
	/*
	 *获取文本
	 *重写characters()方法
	 *String(byte[] bytes,int offset,int length)的构造方法进行数组的传递 
	 *去除解析时多余空格
	 */
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		/*
		 *ch代表节点中的所有内容，即每次遇到一个标签调用characters方法时，数组ch实际都是整个xml文档的内容
		 *如何每次去调用characters方法时我们都可以获取不同的节点属性？ 这时我们就必须结合start(开始节点)和length(长度) 
		 */
		super.characters(ch, start, length);
		/*String*/ value = new String(ch, start, length);//value获取的是文本(开始和结束标签之间的文本)
		System.out.println(value); //输出时会多出两个空格，是因为xml文件中空格与换行符文件中空格与换行符被看成为一个文本节点
		if (!value.trim().equals("")){	//如果value去掉空格后不是空字符串
			System.out.println("节点值是：" + value);
		}
	}
	
	/*
	 *用来遍历xml文件的结束标签 
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		//调用DefaultHandler类的endElement方法
		super.endElement(uri, localName, qName);
		//判断是否针对一本书已经遍历结束
		if (qName.equals("book")) {
			bookList.add(book);	//在清空book对象之前先保存
			book = null;	//把book清空，方便解析下一个book节点
			System.out.println("========结束遍历第" + bookIndex + "本书的内容========");
		}else if (qName.equals("name")) {
			book.setName(value);
		}else if (qName.equals("author")) {
			book.setAuthor(value);
		}else if (qName.equals("year")) {
			book.setYear(value);
		}else if (qName.equals("price")) {
			book.setPrice(value);
		}else if (qName.equals("language")) {
			book.setLanguage(value);
		}
	}
	/*
	 *qName获取的是节点名(标签)
	 *value获取的是文本(开始和结束标签之间的文本)
	 *思考：qName和value分别在两个方法中，如何将这两个方法中的参数整合到一起
	 *分析：要在两个两个方法中用同一个变量就设置为全局变量，可以赋初值为null
	 *可以把characters()方法中的value做成一个全局变量
	 *然后在endElement()方法中对book对象进行设值。记得要把Book对象设置为全局变量，变量共享 
	 */
	
	/*
	 *用来标识解析结束 
	 */
	@Override
	public void endDocument() throws SAXException {
		super.endDocument();
		System.out.println("SAX解析结束");
	}
	
}

