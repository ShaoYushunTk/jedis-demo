package org.example;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * @author Yushun Shao
 * @date 2023/1/31 20:21
 * @description:
 */
public class JedisTest {

    @Test
    public void testRedis(){
        //1.获取连接
        Jedis jedis = new Jedis("localhost",6379);

        //2.执行操作
        jedis.set("username","tom");

        String username = jedis.get("username");
        System.out.println(username);

        jedis.del("username");


        //3.关闭连接
        jedis.close();
    }
}
