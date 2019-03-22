package com.generics;

import typeinfo.pets.Cat;
import typeinfo.pets.Pet;

/**
 * @Author: tang
 * @Date: 2019/3/16 22:20
 * create by IntelliJ IDEA
 */
public class Holder3<T> {
    private T a;
    public Holder3(T a){this.a=a;}
    public void set(T a){this.a=a;}
    public T get(){return a;}

    public static void main(String[] args) {
        Holder3<Automobile> h3=new Holder3<>(new Automobile());
        h3.set(new Automobile());
        Automobile a = h3.get();

        Holder3<Pet> holder3 = new Holder3<>(new Cat());

    }
}
