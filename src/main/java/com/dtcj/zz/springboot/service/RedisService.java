package com.dtcj.zz.springboot.service;

import com.dtcj.zz.springboot.conf.RedisConfig;
import com.dtcj.zz.springboot.utils.RedisUtil;

public class RedisService extends RedisUtil {

	private RedisConfig redisConfig;
	
	public RedisConfig getRedisConfig() {
		return redisConfig;
	}

	public void setRedisConfig(RedisConfig redisConfig) {
		this.redisConfig = redisConfig;
	}

	public RedisService(RedisConfig redisConfig) {
		this.redisConfig = redisConfig;
	}

	public RedisUtil init() {
		return redisConfig
				.redisUtil(redisConfig.functionDomainRedisTemplate(redisConfig
						.JedisConnectionFactory(redisConfig.jedisPoolConfig())));
	}

}
