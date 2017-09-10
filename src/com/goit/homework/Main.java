package com.goit.homework;

public class Main {
    public static void main(String[] args) {

        //sell
        /*
        for(Flowers ArrElement:FlowerStore.sell(3,3,3)) {
            ArrElement.show();}
         */



        //sellSequence
        /*
        for(Flowers ArrElement:FlowerStore.sellSequence(3,3,3)) {
            ArrElement.show();}
        */

        //Записать масив цветов в указаный файл
        //FlowersLoader.writeToFile("files/FlowersArrey.txt",3,3,3);


        //Считать и вывести массив из указаного файла
        /*
        for(Flowers ArrElement:FlowersSaver.readOfFile("files/FlowersArrey.txt")) {
            ArrElement.show();}
        */



        //Показать кошельок
        FlowerStore.showVallet();
    }
}

