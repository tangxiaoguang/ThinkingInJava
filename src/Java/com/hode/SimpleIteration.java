package com.hode;


import typeinfo.pets.*;

import java.util.*;

/**
 * Created by  Tang
 * Create Time 2018/7/4 下午 9:22
 */
public class SimpleIteration {
    public static void main(String[] args){

        List<Pet> pets = Pets.arrayList(12);

        Iterator<Pet> it = pets.iterator();
        while (it.hasNext()){
            Pet p = it.next();

            System.out.print(p.id()+":"+p+" ");
        }

        System.out.println();
        for(Pet pet :pets)
            System.out.print(pet.id()+":"+pet+" ");

        System.out.println();
        it = pets.iterator();
        for(int i = 0;i<6;i++){
            it.next();
            it.remove();
        }

        System.out.print(pets);
    }

}
