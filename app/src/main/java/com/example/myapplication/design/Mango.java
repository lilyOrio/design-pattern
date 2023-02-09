package com.example.myapplication.design;

public class Mango extends Condiment {
    private Beverage beverage;

    public Mango(Beverage bevarage) {
        this.beverage = bevarage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 加芒果";
    }

    public double cost() {
        return beverage.cost() + 3; // 加芒果需要 3 元
    }
}

//看客户端调用：
//
//public static void main(String[] args) {
//    // 首先，我们需要一个基础饮料，红茶、绿茶或咖啡
//    Beverage beverage = new GreenTea();
//    // 开始装饰
//    beverage = new Lemon(beverage); // 先加一份柠檬
//    beverage = new Mongo(beverage); // 再加一份芒果
//
//    System.out.println(beverage.getDescription() + " 价格：￥" + beverage.cost());
//    //"绿茶, 加柠檬, 加芒果 价格：￥16"
//}

//如果我们需要 芒果-珍珠-双份柠檬-红茶：
//
//Beverage beverage = new Mongo(new Pearl(new Lemon(new Lemon(new BlackTea()))));
