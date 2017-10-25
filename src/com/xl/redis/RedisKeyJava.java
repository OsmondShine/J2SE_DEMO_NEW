package com.xl.redis;

import java.util.Iterator;
import java.util.Set;

import redis.clients.jedis.Jedis;

/**
 * @author 作者:xl
 * @data   创建时间:2017-10-3
 * @description 
 * @version 1.0
 */

public class RedisKeyJava {
	public static void main(String[] args) {
		//连接本地的Redis服务
		Jedis jedis = new Jedis("localhost");
		System.out.println("连接成功");
		
		//获取数据并输出
		Set<String> keys = jedis.keys("*");
		Iterator<String> it = keys.iterator();
		while (it.hasNext()){
			String key = it.next();
			System.out.println(key);
		}
	}
}

