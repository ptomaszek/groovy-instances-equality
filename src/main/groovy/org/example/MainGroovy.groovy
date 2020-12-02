package org.example

class MainGroovy {

    static void main(String[] args) {
        //Comment/uncomment below line between compilations to mess with the result
//        def tmp = MyPromise.promise()

        MyPromise p = MyPromise.promise()
        println p == p.future() // should be always 'true'
    }
}
