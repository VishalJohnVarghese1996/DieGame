package com.visvar.game;

import java.util.Random;

public class Die {
    private static int[] values={1,2,3,4,5,6};
    private Integer firstOut;
    private Integer secondOut;

    public void roll(){
        int rnd = new Random().nextInt(this.values.length);
        if(firstOut==null){
            firstOut=this.values[rnd];
        }else if(secondOut==null){
            secondOut=this.values[rnd];
        }else {
            System.out.println("Cannot roll die more than twice");
        }
    }

    public Integer getSumOfOuts(){
        return (this.firstOut+this.secondOut);
    }

    public void printOutcomes(){
        System.out.println("Die 1 outcome : " + this.firstOut);
        System.out.println("Die 2 outcome : " + this.secondOut);
    }
}
