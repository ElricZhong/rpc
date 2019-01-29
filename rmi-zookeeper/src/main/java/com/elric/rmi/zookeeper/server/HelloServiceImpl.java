package com.elric.rmi.zookeeper.server;

import com.elric.rmi.zookeeper.common.HelloService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServiceImpl extends UnicastRemoteObject implements HelloService {

    protected HelloServiceImpl() throws RemoteException {
    }

    public String sayHello(String name) throws RemoteException {
        return "Hello, " + name;
    }
}
