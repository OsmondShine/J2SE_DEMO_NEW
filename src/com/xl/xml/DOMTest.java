package com.xl.xml;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @author 作者:xl
 * @data   创建时间:2017-8-8
 * @description 
 * @version 1.0
 */

public class DOMTest {
	public static void main(String[] args) {
		//1.创建一个DocumentBuilderFactory对象
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		//2.创建一个DocumentBuilder对象
		
		try {
			//创建DocumentBuilder对象
			DocumentBuilder db = dbf.newDocumentBuilder();
			//3.通过DocumentBuilder对象的parser方法加载books.xml文件到当前项目下
			/*注意导入Document对象时，要导入org.w3c.dom.Document包下的*/
			Document document = db.parse("E:\\books.xml");	//传入文件名可以是相对路径或绝对路径
			//获取所有book节点的集合
			NodeList bookList = document.getElementsByTagName("book");
			//通过NodeList的getLength()方法可以获取bookList的长度
			System.out.println("一共有" + bookList.getLength() + "本书");
			//遍历每一个book节点
			for (int i = 0; i < bookList.getLength(); i++){
				System.out.println("==========下面开始遍历第" + (i+1) + "本书的内容=========");
				//注 未知节点属性的个数和属性名时：
					//通过item(i)方法 获取一个book节点，nodeList的索引值从0开始
				Node book = bookList.item(i);
				//获取book节点的所有属性集合
				NamedNodeMap attrs = book.getAttributes();
				System.out.println("第" + (i+1) + "本书共有" + attrs.getLength() + "个属性");
				//遍历book的属性
				for (int j = 0; j < attrs.getLength(); j++){
					//通过item(index)方法获取book节点的某一个属性
					Node attr = attrs.item(j);
					//获取属性名
					System.out.println("属性名：" + attr.getNodeName());
					//获取属性值
					System.out.println("---属性值" + attr.getNodeValue());
				}
				//注 已知book节点有且只有一个id属性：
				/*
				 *	//前提：已知book节点有且只能有1个id属性
				 *	//将book节点进行强制类型转换，转换成Element类型 
				 *	Element book1 = (Element) bookList.item(i);
				 *	//通过getAttribute("id")方法获取属性值
				 *	String attrValue = book1.getAttribute("id");
				 *	System.out.println("id属性的属性值为" + attrValue);
				 * 
				 */
				//解析book节点的子节点
				NodeList childNodes = book.getChildNodes();
				//遍历childNodes获取每个节点的节点名和节点值
				System.out.println("第" + (i+1) + "本书共有" + childNodes.getLength() + "个子节点");
				for (int k = 0; k < childNodes.getLength(); k++){
					//区分出text类型的node以及element类型的node
					if (childNodes.item(k).getNodeType() == Node.ELEMENT_NODE){
						//获取了element类型节点的节点值
						System.out.println("----节点值是：" + childNodes.item(k).getFirstChild().getNodeValue());
//						System.out.println("----节点值是：" + childNodes.item(k).getTextContent());
					}
				}
				System.out.println("========结束遍历第" + (i+1) + "本书的内容=========");
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
}
