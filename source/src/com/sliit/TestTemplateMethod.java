package com.sliit;

public class TestTemplateMethod {

    public static void main(String[] args) {

        System.out.println("===== Tea =====\n");
        Beverages tea = new Tea();
        tea.prepareRecepie();

        System.out.println("===== Coffee =====\n");
        Beverages coffee = new Coffee();
        coffee.prepareRecepie();
    }

}
