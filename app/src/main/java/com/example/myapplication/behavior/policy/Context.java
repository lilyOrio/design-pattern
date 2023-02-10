package com.example.myapplication.behavior.policy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void executeDraw(int radius, int x, int y){
        strategy.draw(radius, x, y);
    }
}

//客户端演示：
//
//public static void main(String[] args) {
//    Context context = new Context(new BluePen()); // 使用绿色笔来画
//      context.executeDraw(10, 0, 0);
//}