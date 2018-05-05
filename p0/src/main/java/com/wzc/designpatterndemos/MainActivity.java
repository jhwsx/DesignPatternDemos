package com.wzc.designpatterndemos;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        Cat cat = new Cat("小花");
//
//        Log.d("MainActivity", cat.shout());
//
//        Dog dog = new Dog("小辉");
//        dog.setShoutNum(10);
//        Log.d("MainActivity", dog.shout());

//        Animal[] animals = new Animal[5];
//        animals[0] = new Cat("小花");
//        animals[1] = new Cat("小白");
//        animals[2] = new Sheep("小黄");
//        animals[3] = new Cattle("小辉");
//        animals[4] = new Dog("小黑");
//
//        for (Animal animal : animals) {
//            String shout = animal.shout();
//            Log.d("MainActivity", shout);
//        }
//
//        MachineCat machineCat = new MachineCat("叮当");
//        String room = machineCat.changeThing("一个房子");
//        Log.d("MainActivity", room);
//
//        StoneMonkey stoneMonkey = new StoneMonkey("悟空");
//        String sky = stoneMonkey.changeThing("一个天宫");
//        Log.d("MainActivity", sky);

        List<Animal> animalList = new ArrayList<>();

        animalList.add(new Cat("小花"));
        animalList.add(new Cat("小白"));
        animalList.add(new Sheep("小黄"));
        animalList.add(new Cattle("小辉"));
        animalList.add(new Dog("小黑"));

        animalList.remove(1);
        animalList.remove(1);

        for (Animal animal : animalList) {
            Log.d("MainActivity", animal.shout());
        }
    }
}
