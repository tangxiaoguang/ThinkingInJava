package com.Java13;

import java.io.*;
import java.util.*;
/**
 * Created by  Tang
 * Create Time 2018/7/29 下午 10:02
 */
public class Turtle {
    private String name;
    private Formatter f;
    public  Turtle(String name,Formatter f){
        this.name = name;
        this.f = f;
    }

    public void move(int x,int y){
        f.format("%s The Turtle is at (%d,%d)",name,x,y);
        System.out.println();
    }

    public static void main(String[] args) {
        PrintStream outAlias = System.err;
        Turtle turtle = new Turtle("Terry",new Formatter(outAlias));
        Turtle tommy = new Turtle("tommy",new Formatter(outAlias));
        turtle.move(1,2);
        tommy.move(8,9);
        tommy.move(10,9);
        turtle.move(2,3);
        turtle.move(3,4);
    }
}
