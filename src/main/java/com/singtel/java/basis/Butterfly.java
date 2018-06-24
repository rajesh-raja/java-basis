package com.singtel.java.basis;

/**
 * Created by RajeshRaja on 24/6/2018.
 */
public class Butterfly extends FlyAnimal implements Animal {
    public boolean walk() {
        return false;
    }

    public boolean fly() {
        return true;
    }
}