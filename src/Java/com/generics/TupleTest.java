package com.generics;

import net.mindview.util.FiveTuple;
import net.mindview.util.FourTuple;
import net.mindview.util.ThreeTuple;
import net.mindview.util.TwoTuple;

/**
 * @Author: tang
 * @Date: 2019/3/16 22:51
 * create by IntelliJ IDEA
 */

class Amphibian{}
class Vehicle{}
public class TupleTest {
    static TwoTuple<String,Integer>f(){
        return new TwoTuple<>("hi",47);
    }
    static ThreeTuple<Amphibian,String,Integer>g(){
        return new ThreeTuple<>(new Amphibian(),"hi",47);
    }
    static FourTuple<Vehicle,Amphibian,String,Integer> h(){
        return new FourTuple<>(new Vehicle(),new Amphibian(),"hi",67);
    }
    static FiveTuple<Vehicle,Amphibian,String,Integer,Double> k() {
        return new FiveTuple<>(new Vehicle(),new Amphibian(),"hi",67,11.3);
    }

    static Object q(){return new Object();}
    public static void main(String[] args) {
        TwoTuple<String,Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(g());
        System.out.println(h());
        FiveTuple object = k();
        Object ob = g();
        System.out.println(ob instanceof String);
    }
}
