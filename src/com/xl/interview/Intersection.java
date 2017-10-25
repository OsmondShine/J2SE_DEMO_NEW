package com.xl.interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 作者:xl
 * @data   创建时间:2017-9-5
 * @description 求集合a和b的交集
 * @version 1.0
 */

public class Intersection {
	public static void main(String[] args) {
		
		int index = 0;
		int[] a = {1, 2, 3, 4, 5,88,555};
		int[] b = {3, 4, 5, 6,88, 7};
		HashMap map1 = new HashMap();
		HashMap map2 = new HashMap();
		
		for (int element: a){
			map1.put(index, element);
			index ++;
		}
		index = 0;
		for (int element2 : b){
			if (map1.containsValue(element2)){
				map2.put(index, element2);
				index ++;
			}
		}
		Set s = map2.keySet();
		Iterator it = s.iterator();
		System.out.print("交集为：{");
		while (it.hasNext()){
			int key = (Integer) it.next();
			System.out.print(" " + map2.get(key));
		}
		System.out.println(" }");
	}
}

