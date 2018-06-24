package com.singtel.java.basis;

/**
 * Created by RajeshRaja on 24/6/2018.
 */
public class Bird implements Animal {
    public boolean fly() {
        System.out.println("I am flying");
        return true;
    }

    public boolean walk() {
        System.out.println("I am walking");
        return true;
    }

    public boolean sing() {
        System.out.println("I am singing");
        return true;
    }

    public boolean swim() {
        System.out.println("I may not swim");
        return false;
    }
}

