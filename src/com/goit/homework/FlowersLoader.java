package com.goit.homework;

import java.io.FileWriter;

public class FlowersLoader {

    public static void writeToFile(String FileName){

        Flowers[] flowers_arr = FlowerStore.sell(2,2,2);

        try{
            FileWriter fileWriter = new FileWriter(FileName);
            for(Flowers ArrElement:flowers_arr) {
                if(ArrElement instanceof rose){fileWriter.write( "роза ");}
                if(ArrElement instanceof chamomile){fileWriter.write( "ромашка ");}
                if(ArrElement instanceof tulip){fileWriter.write( "тюльпан ");}

                fileWriter.flush();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
