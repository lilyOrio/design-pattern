package com.example.myapplication.behavior.observer;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        String result = Integer.toHexString(subject.getState()).toUpperCase();
        System.out.println("订阅的数据发生变化，新的数据处理为十六进制值为：" + result);
    }
}
//客户端使用也非常简单：
//
//public static void main(String[] args) {
//    // 先定义一个主题
//    Subject subject1 = new Subject();
//    // 定义观察者
//    new BinaryObserver(subject1);
//    new HexaObserver(subject1);
//
//    // 模拟数据变更，这个时候，观察者们的 update 方法将会被调用
//    subject.setState(11);
//}

//output:
//
//订阅的数据发生变化，新的数据处理为二进制值为：1011
//订阅的数据发生变化，新的数据处理为十六进制值为：B

//记住核心部分就是一定有一个地方存放了所有的观察者，然后在事件发生的时候，遍历观察者，调用它们的回调函数。