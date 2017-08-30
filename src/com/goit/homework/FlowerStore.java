package com.goit.homework;

public class FlowerStore {

    static int i;

    public static  Flowers[] sell(int RoseCount,int ChamomileCount, int TulipCount){

        Flowers[] flowers_arr = new Flowers[RoseCount+ChamomileCount+TulipCount];

        for(int i =0;i<RoseCount;i++){
            flowers_arr[i]=new rose();
        }

        for(int i = RoseCount;i<RoseCount+ChamomileCount;i++){
            flowers_arr[i]=new chamomile();
        }

        for(int i = RoseCount+ChamomileCount;i<RoseCount+ChamomileCount+TulipCount;i++){
            flowers_arr[i]=new tulip();
        }

        return flowers_arr;
    }

    public static int CountI(){
        return i++;
    }

    public static int C

    public static Flowers[] sellSequence(int RoseCount,int ChamomileCount, int TulipCount){

        Flowers[] flowers_arr = new Flowers[RoseCount+ChamomileCount+TulipCount];

        for(i=0;i<flowers_arr.length;){

            if (count1>0){
                flowers_arr[i]=new rose();
                //count1=-1;
                CountI();
            }
/*
            if (count2>0){
                flowers_arr[i]=new chamomile();
                count2=-1;
                CountI()
            }

            if (count3>0){
                flowers_arr[i]=new tulip();
                count3=-1;
                i=+1;
            }

            */

        }

        return flowers_arr;
    }
}
