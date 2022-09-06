package com.xiaobai.dubbo.service;

/**
 * className: UserServiceImpl
 * description:
 * author: xiaopangio
 * date: 2022/9/6 20:07
 * version: 1.0
 */
public class UserServiceImpl implements IUserService {
    @Override
    public String getNameById(String uid) {
        System.out.println("调用了user-provider的getNameById方法,uid:"+uid);
        return "xiaobai";
    }
}
