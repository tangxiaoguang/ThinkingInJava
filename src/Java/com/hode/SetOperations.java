package com.hode;

import java.util.*;

/**
 * Created by  Tang
 * Create Time 2018/7/12 上午 7:07
 */
public class SetOperations {

    public static void main(String[] args) {

//        Set<String> set1 = new HashSet<String>();
//
//        Collections.addAll(set1,"A B C D E F G H I J K L".split(" "));
//
//        set1.add("M");
//
//        System.out.println("H:"+set1.contains("M"));
//        System.out.println("A B C D E F G H I J K L".split(" "));


        List<Integer> list  = new ArrayList<Integer>(Arrays.asList(1,2,3,4));

        List<Integer> list2 =  new LinkedList<Integer>(list);
        System.out.println(list2);
        Set<Integer> set = new TreeSet<Integer>();

//        Collections.addAll()
        Collection<String> collections = new ArrayList<String>(Arrays.asList("erge","ge"));
        set.addAll(list);
//        System.out.println(list);
    }

}
