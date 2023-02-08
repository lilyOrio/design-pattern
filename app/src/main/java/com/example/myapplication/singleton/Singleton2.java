package com.example.myapplication.singleton;
//4、单例模式--饱汉式
public class Singleton2 {
    // 首先，也是先堵死 new Singleton() 这条路
    private Singleton2() {}
    // 和饿汉模式相比，这边不需要先实例化出来，注意这里的 volatile，它是必须的
//    volatile是Java中的关键字，用来修饰会被不同线程访问和修改的变量。JMM（Java内存模型）
//    是围绕并发过程中如何处理可见性、原子性和有序性这3个特征建立起来的，而volatile可以保证其中的两个特性。
    private static volatile Singleton2 singleton2 = null;

// 双重检查，指两次检查 instance 是否为 null。
    public static Singleton2 getInstance(){
        if (singleton2 == null){
            // 加锁
            synchronized (Singleton2.class){
                // 这一次判断也是必须的，不然会有并发问题
                if (singleton2 == null){
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }

}
