package com.bingkun.activity.service.impl;

import com.bingkun.activity.service.DemoService;

public class DemoServiceImpl implements DemoService {
    @Override
    public String getMessage() {
        return "Hello!";
    }

    @Override
    public Integer getCode() {
        return 123;
    }
}
