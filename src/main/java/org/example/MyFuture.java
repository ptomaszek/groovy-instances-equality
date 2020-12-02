package org.example;

public interface MyFuture {

    static  MyFuture future() {
        System.err.println("Why did I get invoked?");
        return new MyFutureImpl();
    }
} 
