package com.example.myapplication.bridge.abstract_;

import com.example.myapplication.interface_.DrawAPI;

// 圆形
public class Circle extends Shape {
    private int radius;
    public Circle(int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
    }
    public void draw() {
        drawAPI.draw(radius, 0, 0);
    }
}

//最后，我们来看客户端演示：
//
//public static void main(String[] args) {
//    Shape greenCircle = new Circle(10, new GreenPen());
//    Shape redRectangle = new Rectangle(4, 8, new RedPen());
//    greenCircle.draw();
//    redRectangle.draw();
//}

//这回大家应该就知道抽象在哪里，怎么解耦了吧。桥梁模式的优点也是显而易见的，就是非常容易进行扩展。