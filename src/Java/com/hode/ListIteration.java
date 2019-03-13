package com.hode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by  Tang
 * Create Time 2018/7/6 上午 7:56
 */
public class ListIteration {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));

        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));

        Iterator<Integer> it1 = list1.iterator();

        while (it1.hasNext()){
            list2.add(it1.next());
            it1.remove();
        }

        System.out.print(list2);

    }
}
