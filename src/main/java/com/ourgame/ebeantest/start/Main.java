package com.ourgame.ebeantest.start;

import com.ourgame.ebeantest.service.ITestService;
import com.ourgame.ebeantest.service.impl.TestServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by lishijun on 16/6/30.
 */
public class Main {

    public  static  void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applactionContent.xml");
        context.start();
        ITestService testService = (ITestService) context.getBean("testServiceImpl");
        testService.sayHello("test");

        System.in.read();

    }
}
