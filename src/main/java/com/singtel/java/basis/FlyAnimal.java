package com.singtel.java.basis;

/**
 * Created by RajeshRaja on 24/6/2018.
 */
public abstract class FlyAnimal {
    public abstract boolean walk();

    public abstract boolean fly();

    public boolean sing() {
        return false;
    }

    public boolean swim() {
        return false;
    }
}
