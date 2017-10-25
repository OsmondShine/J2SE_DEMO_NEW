package com.xl.redis;

import redis.clients.jedis.Jedis;

/**
 * @author 作者:xl
 * @data   创建时间:2017-10-3
 * @description 
 * @version 1.0
 */

public class RedisJava {
	public static void main(String[] args) {
		//连接本地的redis服务
		Jedis jedis = new Jedis("localhost");
		System.out.println("连接成功");
		//查看服务是否运行
		System.out.println("服务正在运行" + jedis.ping());
	}
}

