package com.xl.advanced.reflect;

import java.lang.reflect.Method;

/**
 * @author 作者:谢亮
 * @data   创建时间:2017-5-31
 * @description 根据标准的JavaBean对象的属性名获取或设置其属性值
 * @version 1.0
 */

public class BeanUtil {

	/**
	 * 根据标准的JavaBean对象的属性名获取其属性值
	 * @param user
	 * @param string
	 * @return
	 */
	public static Object getValueByPropertyName(Object obj, String propertyName) {
		//1.根据属性名称就可以获取其get方法
		String getMethodName = "get" 
				+ propertyName.substring(0, 1).toUpperCase()
				+ propertyName.substring(1);
		//2.获取方法对象
		Class c = obj.getClass();
		try {
			//get方法都是public且无参的
			Method m = c.getMethod(getMethodName);
			//3.通过方法的反射操作方法
			Object value = m.invoke(obj);
			return value;
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return null;
	}
	
	public static void setValueByPropertyName(Object obj, String propertyName, String value){
		String setMethodName = "set"
				+ propertyName.substring(0, 1).toUpperCase()
				+ propertyName.substring(1);
		Class c = obj.getClass();
		try {
			Method m = c.getMethod(setMethodName, String.class);
			m.invoke(obj, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

