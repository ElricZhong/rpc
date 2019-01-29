package com.elric.rmi.zookeeper.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiServer {

    public static void main(String[] args) throws Exception {
        int port = 1099;
        String url = "rmi://localhost:1099/HelloServiceImpl";
        Registry registry = LocateRegistry.createRegistry(port);
        Naming.rebind(url, new HelloServiceImpl());
    }
}
