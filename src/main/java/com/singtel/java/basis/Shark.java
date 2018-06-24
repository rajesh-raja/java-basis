package com.singtel.java.basis;

/**
 * Created by RajeshRaja on 24/6/2018.
 */
public class Shark extends Fish {
    public SIZE size() {
        return SIZE.LARGE;
    }

    public COLOR color() {
        return COLOR.GREY;
    }

    public void eat() {
        System.out.println("Eat other fish");
    }
}