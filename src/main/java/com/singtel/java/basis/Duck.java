package com.singtel.java.basis;

/**
 * Created by RajeshRaja on 24/6/2018.
 */
public class Duck extends Bird {
    public boolean sing() {
        System.out.println("Quack, quack");
        return true;
    }

    public boolean swim() {
        System.out.println("I can swim");
        return true;
    }
}

