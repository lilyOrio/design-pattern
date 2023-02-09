package com.example.myapplication.proxy;

import com.example.myapplication.bean.Chicken;
import com.example.myapplication.bean.Food;
import com.example.myapplication.bean.Noodle;
import com.example.myapplication.interface_.FoodService;

public class FoodServiceImpl implements FoodService {

    @Override
    public Food makeChicken() {
        Food f = new Chicken();
        ((Chicken) f).setChicken("1kg");
        f.setSpicy("1g");
        f.setSalt("3g");
        return f;
    }

    @Override
    public Food makeNoodle() {
        Food f = new Noodle();
        f.setNoodle("500g");
        f.setSalt("5g");
        return f;
    }
}
