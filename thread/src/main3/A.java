package main3;

public class A {

    public void m1(){
        // not synchronized
        synchronized (this){
            System.out.println("A");
        }
        // not synchronized
    }

    public synchronized /* this */ void m2() {
            System.out.println("A");
    }

    public static synchronized void c() {

    }
    public static void d() {
        synchronized (A.class){

        }
    }
}

// when we use synchronized on method signature it synchronizes the whole block of method

// synchronized with static method =>
/*
* A class loader which manages our instances and created instances always one blueprint of the class even if there are no
*  instances created for creating instances so in static method we can use this blueprint
* */
