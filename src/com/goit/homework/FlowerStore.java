package com.goit.homework;

public class FlowerStore {

    static int i;

    public static  Flowers[] sell(int RoseCount,int ChamomileCount, int TulipCount){

        Flowers[] flowers_arr = new Flowers[RoseCount+ChamomileCount+TulipCount];

        for(int i =0;i<RoseCount;i++){
            flowers_arr[i]=new rose();
            setVallet(100);
        }

        for(int i = RoseCount;i<RoseCount+ChamomileCount;i++){
            flowers_arr[i]=new chamomile();
            setVallet(70);
        }

        for(int i = RoseCount+ChamomileCount;i<RoseCount+ChamomileCount+TulipCount;i++){
            flowers_arr[i]=new tulip();
            setVallet(45);
        }

        return flowers_arr;
    }

    public static Flowers[] sellSequence(int RoseCount,int ChamomileCount, int TulipCount){

        Flowers[] flowers_arr = new Flowers[RoseCount+ChamomileCount+TulipCount];

        for(i=0;i<flowers_arr.length;){

            if (RoseCount>0){
                flowers_arr[i]=new rose();
                CountMinusOne(RoseCount);
                IPlusOne();
                setVallet(100);
            }

            if (ChamomileCount>0){
                flowers_arr[i]=new chamomile();
                CountMinusOne(ChamomileCount);
                IPlusOne();
                setVallet(70);
            }

            if (TulipCount>0){
                flowers_arr[i]=new tulip();
                CountMinusOne(TulipCount);
                IPlusOne();
                setVallet(45);
            }

        }

        return flowers_arr;
    }

    public static int IPlusOne(){
        return i++;
    }

    public static int CountMinusOne(int count){
        return count-1;
    }

    //////////////////////////////vallet//////////////////////////////

    static private int vallet = 0;

    static void setVallet(int cost){
        vallet = vallet +cost;
    }

    static void showVallet(){
        System.out.println(vallet);
    }
}
