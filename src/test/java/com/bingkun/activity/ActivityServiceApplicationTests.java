package com.bingkun.activity;

import com.bingkun.activity.service.DemoService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivityServiceApplicationTests {

    @Resource
    private DemoService demoService;

    @Test
    public void test() {
        String message = demoService.getMessage();
        System.out.println(message);
        Assert.assertEquals("Hello!", message);

        Integer code = demoService.getCode();
        System.out.println(code);
        Assert.assertEquals(123, (int) code);
    }

}
