package com.syun.commons.jedis;

import redis.clients.jedis.JedisCluster;

import java.util.List;

/**
 * Create by it_mck 2018/7/29 18:44
 *
 * @Description:
 * @Version: 1.0
 */
public class JedisClientCluster implements JedisClient {

    private JedisCluster  jedisCluster;

    public JedisCluster getJedisCluster() {
        return jedisCluster;
    }

    public void setJedisCluster(JedisCluster jedisCluster) {
        this.jedisCluster = jedisCluster;
    }

    @Override
    public String set(String key, String value) {
        return jedisCluster.set(key,value);
    }

    @Override
    public String get(String key) {
        return jedisCluster.get(key);
    }

    @Override
    public Boolean exists(String key) {
        return jedisCluster.exists(key);
    }

    @Override
    public Long expire(String key, int seconds) {
        return jedisCluster.expire(key,seconds);
    }

    @Override
    public Long ttl(String key) {
        return jedisCluster.ttl(key);
    }

    @Override
    public Long incr(String key) {
        return jedisCluster.incr(key);
    }

    @Override
    public Long del(String key) {
        return jedisCluster.del(key);
    }

    @Override
    public Long hset(String key, String field, String value) {
        return jedisCluster.hset(key, field, value);
    }

    @Override
    public String hget(String key, String field) {
        return jedisCluster.hget(key, field);
    }

    @Override
    public Long hdel(String key, String... field) {
        return jedisCluster.hdel(key, field);
    }

    @Override
    public Boolean hexists(String key, String field) {
        return jedisCluster.hexists(key, field);
    }

    @Override
    public List<String> hvals(String key) {
        return jedisCluster.hvals(key);
    }

    @Override
    public Long lpush(String key, String... strings) {
        return jedisCluster.lpush(key, strings);
    }

    @Override
    public List<String> lrange(String key, long start, long end) {
        return jedisCluster.lrange(key, start, end);
    }
}
