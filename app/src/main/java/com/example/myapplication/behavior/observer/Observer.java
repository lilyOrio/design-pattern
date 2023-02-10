package com.example.myapplication.behavior.observer;

//定义观察者接口：

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
