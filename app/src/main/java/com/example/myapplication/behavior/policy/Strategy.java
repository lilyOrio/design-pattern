package com.example.myapplication.behavior.policy;

/**
 * 策略模式
 * 策略模式太常用了，所以把它放到最前面进行介绍。它比较简单，我就不废话，直接用代码说事吧。
 *
 * 下面设计的场景是，我们需要画一个图形，可选的策略就是用红色笔来画，还是绿色笔来画，或者蓝色笔来画。
 *
 * 首先，先定义一个策略接口：
 */
public interface Strategy {
    public void draw(int radius, int x, int y);
}
