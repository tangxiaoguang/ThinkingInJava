package com.demo;

import java.util.*;

/**
 * Created by  Tang
 * Create Time 2018/6/28 下午 9:58
 */
public class AslistInference {

    public static void main(String[] args) {

        List <Snow> snow1 = Arrays.asList(new Snow(),new Powder(),new Crusty());

        List <Snow> snow2 = Arrays.asList(new Light(),new Heavy());

        List <Snow> snow3 = new ArrayList<Snow>();

        snow3.add(new Snow());

        Collections.addAll(snow3 , new Slush(),new Crusty());



        for(Snow snow :snow2){
            System.out.println(snow);
        }
    }

}



class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends  Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}