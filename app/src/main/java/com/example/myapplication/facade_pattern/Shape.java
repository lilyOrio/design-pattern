package com.example.myapplication.facade_pattern;

/**
 * 门面模式（也叫外观模式，Facade Pattern）在许多源码中有使用，比如 slf4j 就可以理解为是门面模式的应用。
 * 这是一个简单的设计模式，我们直接上代码再说吧。
 *
 * 首先，我们定义一个接口：
 */
public interface Shape {
    void draw();
}

//定义几个实现类：
//
//public class Circle implements Shape {
//    @Override
//    public void draw() {
//       System.out.println("Circle::draw()");
//    }
//}
//
//public class Rectangle implements Shape {
//    @Override
//    public void draw() {
//       System.out.println("Rectangle::draw()");
//    }
//}
//客户端调用：
//
//public static void main(String[] args) {
//    // 画一个圆形
//      Shape circle = new Circle();
//      circle.draw();
//
//      // 画一个长方形
//      Shape rectangle = new Rectangle();
//      rectangle.draw();
//}
//以上是我们常写的代码，我们需要画圆就要先实例化圆，画长方形就需要先实例化一个长方形，然后再调用相应的 draw() 方法。