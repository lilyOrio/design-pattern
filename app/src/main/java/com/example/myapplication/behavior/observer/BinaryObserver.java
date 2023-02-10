package com.example.myapplication.behavior.observer;

/**
 * 其实如果只有一个观察者类的话，接口都不用定义了，不过，通常场景下，既然用到了观察者模式，
 * 我们就是希望一个事件出来了，会有多个不同的类需要处理相应的信息。比如，订单修改成功事件，
 * 我们希望发短信的类得到通知、发邮件的类得到通知、处理物流信息的类得到通知等。
 *
 * 我们来定义具体的几个观察者类：
 */
public class BinaryObserver extends Observer{
    // 在构造方法中进行订阅主题
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        // 通常在构造方法中将 this 发布出去的操作一定要小心
        this.subject.attach(this);
    }

    // 该方法由主题类在数据变更的时候进行调用
    @Override
    public void update() {
        String result = Integer.toBinaryString(subject.getState());
        System.out.println("订阅的数据发生变化，新的数据处理为二进制值为：" + result);
    }
}
