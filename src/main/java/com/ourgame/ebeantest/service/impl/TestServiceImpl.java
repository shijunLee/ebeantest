package com.ourgame.ebeantest.service.impl;

import com.ourgame.ebeantest.service.ITestService;
import org.springframework.stereotype.Service;

/**
 * Created by lishijun on 16/6/30.
 */

@Service
public class TestServiceImpl implements ITestService {
    public void sayHello(String args) {
        System.out.println("hello world " +args);
    }
}
