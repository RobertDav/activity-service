package com.bingkun.activity;

import com.bingkun.activity.service.DemoService;
import com.bingkun.activity.service.impl.DemoServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(DemoService.class)
    public DemoService demoService(){
        return new DemoServiceImpl();
    }
}
