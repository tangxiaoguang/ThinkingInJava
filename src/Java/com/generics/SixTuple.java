package com.generics;

import net.mindview.util.FiveTuple;

/**
 * @Author: tang
 * @Date: 2019/3/17 11:29
 * create by IntelliJ IDEA
 */
public class SixTuple<A,B,C,D,E,F> extends FiveTuple<A,B,C,D,E> {

    public final F sixth;
    public SixTuple(A a,B b,C c,D d,E e,F f){
        super(a,b,c,d,e);
        this.sixth = f;
    }

    public String toString(){
        return "("+first+","+second+","+third+","+fourth+","+fifth+","+sixth+")";
    }

    public static void main(String[] args) {
        SixTuple s = new SixTuple("1",1,'c',"d",1.2,new Automobile());

        System.out.println(s.toString());
    }
}
