package com.xiaobai.dubbo;

import com.xiaobai.dubbo.service.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * className: DubboMain
 * description:
 * author: xiaopangio
 * date: 2022/9/6 20:18
 * version: 1.0
 */
public class DubboMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:/META-INF/spring/order-service.xml");
        IUserService userService = (IUserService) context.getBean("userService");
        System.out.println(userService.getNameById("1"));
    }
}
