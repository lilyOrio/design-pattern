package com.example.myapplication.bridge.pen;

import com.example.myapplication.interface_.DrawAPI;

public class GreenPen implements DrawAPI {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用绿色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
