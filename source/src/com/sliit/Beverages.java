package com.sliit;

public abstract class Beverages {

    public abstract void addCondiments();
    public abstract void brew();

    public final void prepareRecepie() {
        boilWater();
        brew();
        addCondiments();
        pourInCup();
    }

    void boilWater() {
        System.out.println("Boiling water.");
    }

    void pourInCup() {
        System.out.println("Pour into cup.");
    }
}
