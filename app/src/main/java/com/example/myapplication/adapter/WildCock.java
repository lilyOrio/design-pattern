package com.example.myapplication.adapter;

import com.example.myapplication.interface_.Cock;
//鸭接口有 fly() 和 quare() 两个方法，鸡 Cock 如果要冒充鸭，fly() 方法是现成的，
// 但是鸡不会鸭的呱呱叫，没有 quack() 方法。这个时候就需要适配了
public class WildCock implements Cock {
    public void gobble() {
        System.out.println("咕咕叫");
    }

    public void fly() {
        System.out.println("鸡也会飞哦");
    }
}
