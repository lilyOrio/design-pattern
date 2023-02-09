package com.example.myapplication.adapter;

import com.example.myapplication.interface_.Cock;
import com.example.myapplication.interface_.Duck;

/**
 * 适配器模式总结
 *
 * 类适配和对象适配的异同
 * 一个采用继承，一个采用组合；
 * 类适配属于静态实现，对象适配属于组合的动态实现，对象适配需要多实例化一个对象。
 * 总体来说，对象适配用得比较多。
 */
public class CockAdapter implements Duck {
    Cock cock;

    public CockAdapter(Cock cock) {
        this.cock = cock;
    }

    // 实现鸭的呱呱叫方法
    @Override
    public void quack() {
        // 内部其实是一只鸡的咕咕叫
        cock.gobble();
    }

    @Override
    public void fly() {
        cock.fly();
    }
}

//客户端调用很简单了：
//
//public static void main(String[] args) {
//      // 有一只野鸡
//      Cock wildCock = new WildCock();
//      // 成功将野鸡适配成鸭
//      Duck duck = new CockAdapter(wildCock);
//      ...
//}

///**
// * 到这里，大家也就知道了适配器模式是怎么回事了。无非是我们需要一只鸭，但是我们只有一只鸡，
// * 这个时候就需要定义一个适配器，由这个适配器来充当鸭，但是适配器里面的方法还是由鸡来实现的。
// */

