package com.hode;

import typeinfo.pets.Person;
import typeinfo.pets.Pet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by  Tang
 * Create Time 2018/7/18 下午 9:44
 */
public class MapOfList {

    public static Map<Person,List<? extends Pet>>
        petPeople = new HashMap<Person, List<? extends Pet>>();
    static{
        System.out.println("regerge");
    }
public void fun(){
        System.out.println("haha");
}
    public static void main(String[] args) {
//        MapOfList obj = new MapOfList();
    }

}
