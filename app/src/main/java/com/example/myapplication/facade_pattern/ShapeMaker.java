package com.example.myapplication.facade_pattern;

//下面，我们看看怎么用门面模式来让客户端调用更加友好一些。我们先定义一个门面：

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    /**
     * 下面定义一堆方法，具体应该调用什么方法，由这个门面来决定
     */

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}

//看看现在客户端怎么调用：
//
//public static void main(String[] args) {
//  ShapeMaker shapeMaker = new ShapeMaker();
//
//  // 客户端调用现在更加清晰了
//  shapeMaker.drawCircle();
//  shapeMaker.drawRectangle();
//  shapeMaker.drawSquare();
//}
