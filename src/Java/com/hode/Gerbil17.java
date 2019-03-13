package com.hode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by  Tang
 * Create Time 2018/7/19 上午 7:41
 */
public class Gerbil17 {
    private int gerbilNumber;

    public static int num = 1;

    Gerbil17(){gerbilNumber=num++;}

    public void hop(){
        System.out.println(gerbilNumber);

    }

    public static void main(String[] args) {
        Map<String,Gerbil17> gerbil17 = new HashMap<String, Gerbil17>();

        gerbil17.put("Fuzzy",new Gerbil17());
        gerbil17.put("spot",new Gerbil17());
        gerbil17.put("speedy",new Gerbil17());
        gerbil17.put("dopey",new Gerbil17());
        gerbil17.put("sleepy",new Gerbil17());
        gerbil17.put("happy",new Gerbil17());

        Iterator<String> it = gerbil17.keySet().iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.print(s +": ");
            gerbil17.get(s).hop();
        }

    }
}
