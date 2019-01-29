package com.elric.rmi.zookeeper.client;

import com.elric.rmi.zookeeper.common.HelloService;

import java.rmi.Naming;

public class RmiClient {

    public static void main(String[] args) throws Exception {
        String url = "rmi://localhost:1099/HelloServiceImpl";
        HelloService helloService = ((HelloService) Naming.lookup(url));
        String result = helloService.sayHello("world");
        System.out.println(result);
    }
}
