package com.singtel.java.basis;

/**
 * Created by RajeshRaja on 24/6/2018.
 */
public class Caterpillar extends FlyAnimal implements Animal {
    public boolean walk() {
        return true;
    }

    public boolean fly() {
        return false;
    }
}
