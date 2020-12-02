package org.example;

class MyFutureImpl implements MyPromise, MyFuture {

    @Override
    public MyFuture future() {
        return this;
    }
}
