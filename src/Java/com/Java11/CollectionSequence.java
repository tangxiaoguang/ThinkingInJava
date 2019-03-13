package com.Java11;

import typeinfo.pets.*;

import java.util.*;

/**
 * Created by  Tang
 * Create Time 2018/7/26 上午 7:53
 */
public class CollectionSequence extends AbstractCollection<Pet> {

    private Pet[] pet = Pets.createArray(10);
    @Override
    public Iterator<Pet> iterator() {
        return  new Iterator<Pet>() {

            private Integer index = 0;
            @Override
            public boolean hasNext() {
                return index<pet.length;
            }

            @Override
            public Pet next() {
                return pet[index++];
            }

            public void remove(){
                throw  new UnsupportedOperationException();
            }
        };
    }

    @Override
    public int size() {
        return pet.length;
    }

    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        for(Pet pet:c){
            System.out.print(pet+" ");
        }
            Iterator<Pet> d = c.iterator();
        System.out.println();
        while (d.hasNext()){
            System.out.print(d.next()+" ");
        }
    }
}

