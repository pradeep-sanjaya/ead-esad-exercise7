package com.sliit;

public class Tea extends Beverages {
    @Override
    public void addCondiments() {
        System.out.println("Steeping the Tea.");
    }

    @Override
    public void brew() {
        System.out.println("Adding Lemon.");
    }
}