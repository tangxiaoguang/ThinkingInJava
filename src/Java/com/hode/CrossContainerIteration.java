package com.hode;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.*;

/**
 * Created by  Tang
 * Create Time 2018/7/4 下午 10:18
 */
public class CrossContainerIteration {

    public static void display(Iterator<Pet> it){
        while (it.hasNext()){

            Pet p =  it.next();
            System.out.print(p.id()+":"+p+" ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Pet> pets = Pets.arrayList(8);

        LinkedList<Pet> petsLL  = new LinkedList<Pet>(pets);

        HashSet<Pet> petsHS = new HashSet<Pet>(pets);

        TreeSet<Pet> petsTS =  new TreeSet<Pet>(pets);

        display(pets.iterator());

        display(petsLL.iterator());

        display((petsHS.iterator()));

        display(petsTS.iterator());
    }
}
