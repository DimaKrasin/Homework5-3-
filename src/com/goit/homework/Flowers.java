package com.goit.homework;

public class Flowers {

    int cost;

    public void show(){
        System.out.println("Это цветок : "+this.getClass().getSimpleName());
    }

    public int GetCost(){
        return cost;
    }
}
