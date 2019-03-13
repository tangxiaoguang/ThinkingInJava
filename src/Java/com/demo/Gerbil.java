package com.demo;

import java.util.ArrayList;

/**
 * Created by  Tang
 * Create Time 2018/6/27 下午 10:48
 */
public class Gerbil {
    private int gerbilNumber;

    public static int num = 1;

    Gerbil(){gerbilNumber=num++;}

    public void hop(){
        System.out.println(gerbilNumber);

    }

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();

        for (int i=0;i<5;i++)
            gerbils.add(new Gerbil());

        for (int i =0;i<gerbils.size();i++)
            gerbils.get(i).hop();

    }
}

