package com.goit.homework;

import java.io.FileWriter;

public class FlowersLoader {

    public static void writeToFile(String FileName,int RoseCount,int ChamomileCount,int TulipCount){

        Flowers[] flowers_arr = FlowerStore.sell(RoseCount,ChamomileCount,TulipCount);

        try{
            FileWriter fileWriter = new FileWriter(FileName);

            fileWriter.write("" + flowers_arr.length + "\n");

            for(Flowers ArrElement:flowers_arr) {
                if(ArrElement instanceof rose){fileWriter.write( "роза ");}
                if(ArrElement instanceof chamomile){fileWriter.write( "ромашка ");}
                if(ArrElement instanceof tulip){fileWriter.write( "тюльпан ");}
            }
            fileWriter.flush();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
