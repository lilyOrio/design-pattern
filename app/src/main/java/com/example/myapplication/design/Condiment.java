package com.example.myapplication.design;

// 定义调料，也就是装饰者的基类，此类必须继承自 Beverage：
// 调料
public abstract class Condiment extends Beverage {

}
//然后我们来定义柠檬、芒果等具体的调料，它们属于装饰者，毫无疑问，这些调料肯定都需要继承调料 Condiment 类：