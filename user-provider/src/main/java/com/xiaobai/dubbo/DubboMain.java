package com.xiaobai.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * className: DubboMain
 * description:
 * author: xiaopangio
 * date: 2022/9/6 20:14
 * version: 1.0
 */
public class DubboMain {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:/META-INF/spring/user-provider.xml");
        context.start();
        System.in.read();

    }
}
