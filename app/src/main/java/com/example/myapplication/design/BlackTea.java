package com.example.myapplication.design;

public class BlackTea extends Beverage {
    public String getDescription() {
        return "红茶";
    }

    @Override
    public double cost() {
        return 10;
    }

}
