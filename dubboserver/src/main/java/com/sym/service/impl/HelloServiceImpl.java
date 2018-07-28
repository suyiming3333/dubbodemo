package com.sym.service.impl;

import com.sym.service.HelloService;

public class HelloServiceImpl implements HelloService
{
    public String sayHello(String name) {
        System.out.println("dubbo service invoke");
        return "hello "+name+",this is dubbo server message~!";
    }
}
