package org.example;

public interface MyPromise {

    static  MyPromise promise() {
        return new MyFutureImpl();
    }

    MyFuture future();
}
