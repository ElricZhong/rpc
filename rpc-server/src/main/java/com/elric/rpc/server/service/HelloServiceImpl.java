package com.elric.rpc.server.service;

import com.elric.rpc.common.service.HelloService;
import com.elric.rpc.server.RpcService;

@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello! " + name;
    }
}
