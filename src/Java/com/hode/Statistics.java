package com.hode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/**
 * Created by  Tang
 * Create Time 2018/7/18 下午 10:06
 */
public class Statistics {

    public static void main(String[] args) {

        Random rand = new Random(47);

        HashMap<Integer,Integer> m = new HashMap<Integer, Integer>();

        for (int i = 0;i<10000;i++){

            int r = rand.nextInt(20);

            Integer freq = m.get(r);

            m.put(r,freq==null?1:freq+1);

        }

        System.out.println(m);
    }

}
