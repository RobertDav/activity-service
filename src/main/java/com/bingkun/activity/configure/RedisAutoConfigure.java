package com.bingkun.activity.configure;

import com.bingkun.activity.properties.RedisProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;


@Configuration
/**
 *
 * @ConfigurationProperties注解主要用来把properties配置文件转化为bean来使用的，
 * 而@EnableConfigurationProperties注解的作用是@ConfigurationProperties注解生效。
 * 如果只配置@ConfigurationProperties注解，在IOC容器中是获取不到properties配置文件转化的bean的。
 */
@EnableConfigurationProperties(RedisProperties.class)
@ConditionalOnClass({Jedis.class})
public class RedisAutoConfigure {
    @Autowired
    private RedisProperties properties;
    @Bean
    public Jedis myRedis() {
        Jedis jedis = new Jedis(properties.getAddress(), properties.getPort());
        return  jedis;
    }
}
