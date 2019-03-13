package com.Java13;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by  Tang
 * Create Time 2018/7/28 下午 9:45
 */
public class InfiniteRecursion {
    public String toString(){
        return "InfiniteRecursion address: "+super.toString()+"\n";
    }

    public static void main(String[] args) {

        List<InfiniteRecursion> infiniteRecursions = new ArrayList<InfiniteRecursion>();

        for (int i = 0;i<10;i++){
            infiniteRecursions.add(new InfiniteRecursion());

        }
        System.out.println(infiniteRecursions);
    }
}
