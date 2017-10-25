package com.xl.redis;

import redis.clients.jedis.Jedis;

/**
 * @author 作者:xl
 * @data   创建时间:2017-10-3
 * @description 
 * @version 1.0
 */

public class RedisStringJava {
	public static void main(String[] args) {
		//连接本地的redis服务
		Jedis jedis = new Jedis("localhost");
		System.out.println("连接成功");
		jedis.set("name", "XieLiang");
		//获取存储的数据并输出
		System.out.println("redis存储的字符创为："+jedis.get("name"));
	}
}

