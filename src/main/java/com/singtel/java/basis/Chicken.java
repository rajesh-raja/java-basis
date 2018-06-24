package com.singtel.java.basis;

/**
 * Created by RajeshRaja on 24/6/2018.
 */
public class Chicken extends Bird {

    private String sing = "Cluck, cluck";

    public Chicken(String sing) {
        this.sing = sing;
    }

    public Chicken() {
    }

    public boolean sing() {
        System.out.println(this.sing);
        return true;
    }

    public boolean fly() {
        System.out.println("I can not fly");
        return false;
    }
}