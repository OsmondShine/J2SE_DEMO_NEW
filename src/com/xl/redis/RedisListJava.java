package com.xl.redis;

import java.util.List;

import redis.clients.jedis.Jedis;

/**
 * @author 作者:xl
 * @data   创建时间:2017-10-3
 * @description 
 * @version 1.0
 */

public class RedisListJava {
	public static void main(String[] args) {
		//连接本地的Redis服务
		Jedis jedis = new Jedis("localhost");
		System.out.println("连接成功");
		//存储数据到列表中
		jedis.lpush("dbs", "mysql");
		jedis.lpush("dbs", "mongodb");
		jedis.lpush("dbs", "redis");
		//获取存储数据并输出
		List<String> list = jedis.lrange("dbs", 0, 2);
		for ( int i = 0; i < list.size(); i++){
			System.out.println("列表项为：" + list.get(i));
		}
}
}

