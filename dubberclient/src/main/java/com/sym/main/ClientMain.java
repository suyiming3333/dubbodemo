package com.sym.main;

import com.sym.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationConsumer.xml" });
        context.start();
        HelloService service = (HelloService) context.getBean("helloService");
        System.out.println(service.sayHello("world222"));
        context.close();
    }

}
