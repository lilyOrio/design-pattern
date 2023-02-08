package com.example.myapplication.singleton;

// 4、单例模式--嵌套类型
public class Singleton3 {
    private Singleton3(){}
    // 主要是使用了 嵌套类可以访问外部类的静态属性和静态方法 的特性
    private static class Holder{
        private static Singleton3 singleton3 = new Singleton3();
    }

    public static Singleton3 getInstance(){
        return Holder.singleton3;
    }
}
//最后，我们说一下枚举，枚举很特殊，它在类加载的时候会初始化里面的所有的实例，而且 JVM 保证了它们不会再被实例化，
//所以它天生就是单例的。
//虽然我们平时很少看到用枚举来实现单例，但是在 RxJava 的源码中，有很多地方都用了枚举来实现单例。
