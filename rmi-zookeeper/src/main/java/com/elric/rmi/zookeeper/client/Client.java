package com.elric.rmi.zookeeper.client;

import com.elric.rmi.zookeeper.common.HelloService;

public class Client {

    public static void main(String[] args) throws Exception {
        ServiceConsumer consumer = new ServiceConsumer();

        while (true) {
            HelloService helloService = consumer.lookup();
            String result = helloService.sayHello("world");
            System.out.println(result);
            Thread.sleep(3000);
        }
    }
}
