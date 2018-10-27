package com.cc.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisCache {

    private JedisPool jedisPool=new JedisPool();

    public JedisPool getJedisPool() {
        return jedisPool;
    }

    public void setJedisPool(JedisPool jedisPool) {

        System.out.println("来了");
        this.jedisPool = jedisPool;
    }

    //存数据到redis
    public void setDataToRedis(String key,String value){
        Jedis jedis=jedisPool.getResource();
        jedis.set(key, value);
    }

    //获取redis中的数据
    public String getDataFromRedis(String key){
        Jedis jedis=jedisPool.getResource();
        return jedis.get(key);
    }

    public void saveRedis(String key, String value, Long expireSecond) {
        Jedis jedis=jedisPool.getResource();
        boolean keyExist = jedis.exists(key);
        // NX是不存在时才set， XX是存在时才set， EX是秒，PX是毫秒
        if (keyExist) {
            jedis.del(key);
        }
        jedis.set(key, value, "NX", "EX", expireSecond);
    }


}
