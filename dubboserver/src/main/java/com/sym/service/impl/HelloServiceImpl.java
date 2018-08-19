package com.sym.service.impl;

import com.sym.service.HelloServiceI;

public class HelloServiceImpl implements HelloServiceI
{
    public String sayHello(String name) {
        System.out.println("dubbo service invoke");
        return "hello "+name+",this is dubbo server message~!";
    }
}
