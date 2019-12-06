package com.example.youactiguess;

import java.util.ArrayList;
import java.util.Random;

public class DataBase {

    //get random number
    private static Random r = new Random();

    //database.
    private static ArrayList<String> list = new ArrayList<String>();
    static {
        list.add("pig");
        list.add("dog");
        list.add("pizza");
        list.add("desk");
        list.add("door");
        list.add("run");
        list.add("mouse");
        list.add("book");
        list.add("UIUC");
        list.add("cake");
        list.add("jump");
        list.add("milk");
        list.add("rabbit");
        list.add("chip");
        list.add("dress");
        list.add("sad");
        list.add("math");
        list.add("cry");
        list.add("trump");
        list.add("google");
        list.add("java");
        list.add("dictionary");
        list.add("Wechat");
        list.add("photo");
        list.add("essay");
        list.add("hit");
        list.add("eat");
        list.add("drink");
        list.add("siri");
        list.add("android");
        list.add("MP");
        list.add("computer");
    }

    //randomly get one thing.
    public String getInfo() {
        int i = r.nextInt(list.size());
        System.out.println("random" + i);
        return list.get(i);
    }
}
