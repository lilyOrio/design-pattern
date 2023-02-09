package com.example.myapplication.proxy;

import com.example.myapplication.bean.Food;
import com.example.myapplication.interface_.FoodService;

/**
 * 代理模式
 *
 * 第一个要介绍的代理模式是最常使用的模式之一了，用一个代理来隐藏具体实现类的实现细节，通常还用于在真实的实现的前后添加一部分逻辑。
 *
 * 既然说是代理，那就要对客户端隐藏真实实现，由代理来负责客户端的所有请求。当然，代理只是个代理，它不会完成实际的业务逻辑，
 * 而是一层皮而已，但是对于客户端来说，它必须表现得就是客户端需要的真实实现
 */

// 代理要表现得“就像是”真实实现类，所以需要实现 FoodService
public class FoodServiceProxy implements FoodService {

    // 内部一定要有一个真实的实现类，当然也可以通过构造方法注入
    private FoodService foodService = new FoodServiceImpl();

    @Override
    public Food makeChicken() {
        return foodService.makeChicken();
    }

    @Override
    public Food makeNoodle() {
        return foodService.makeNoodle();
    }
}

//客户端调用，注意，我们要用代理来实例化接口：
// 这里用代理类来实例化
//FoodService foodService = new FoodServiceProxy();
//foodService.makeChicken();