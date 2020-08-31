package com.sliit;

public class Coffee extends Beverages {
    @Override
    public void addCondiments() {
        System.out.println("Add sugar and milk.");
    }

    @Override
    public void brew() {
        System.out.println("Stripping coffee through filter.");
    }
}
