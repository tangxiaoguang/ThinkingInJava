package com.Java11;

import java.util.*;

/**
 * Created by  Tang
 * Create Time 2018/7/23 下午 9:11
 */
public class Java18 {

    public static void main(String[] args) {
        Map<String,Gerbil> mg = new HashMap<String, Gerbil>();
        mg.put("a",new Gerbil("tang"));
        mg.put("b",new Gerbil("xiao"));
        mg.put("c",new Gerbil("guang"));
        mg.put("cd",new Gerbil("guangs"));
        mg.put("cdre",new Gerbil("guanhyrgs"));

        System.out.println("mg"+" ");
//        TreeSet<String> sg = new TreeSet<String>();
        HashSet<String> sg = new HashSet<String>();
        sg.addAll(mg.keySet());
        System.out.println(sg);
        LinkedHashMap<String,Gerbil> lhm = new LinkedHashMap<String, Gerbil>();
        for (String s:sg){
            lhm.put(s,mg.get(s));
        }
        System.out.println(lhm);
    }
}

class Gerbil{

    private int counter = 0;
    private String name;
    private int gerbilNumber = counter++;
    Gerbil(String name ){
        this.name= name;
    }
    public String toString(){
        return name;
    }
    int hop(){
        return gerbilNumber;
    }
}