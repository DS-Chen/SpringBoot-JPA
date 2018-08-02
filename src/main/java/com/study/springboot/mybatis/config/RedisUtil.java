package com.study.springboot.mybatis.config;

import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @author chendongsuo
 * @create 2018-07-04 14:09
 * @email dongsuo.chen@nvr-china.com
 * @description Redis工具类
 */
public class RedisUtil {
    private StringRedisTemplate redisTemplate;

    public RedisUtil() {
    }

    public RedisUtil(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public StringRedisTemplate getRedisTemplate() {
        return redisTemplate;
    }

    public void setRedisTemplate(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    /**
     *
     */
    /**
     * 删除key
     */
    public void delete(String key) {
        redisTemplate.delete(key);
    }
}
