package com.Java13;

import java.util.Formatter;

/**
 * Created by  Tang
 * Create Time 2018/7/31 下午 9:07
 */
public class Receipt {
    private double total = 0;
    private Formatter f = new Formatter(System.out);
    public void printTitle(){
        f.format("%-15s %5s %10s\n","Item","Qty","Price");
        f.format("%-15s %5s %10s\n","----","----","----");
    }

    public void print(String name,int qty,double price){
        f.format("-15.15s %5d %10.2f\n",name,qty,price);
        total +=price;
    }

    public void printTotal(){

//        f.format("%-15s %5s %5d %10.2\n",);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
    }
}
