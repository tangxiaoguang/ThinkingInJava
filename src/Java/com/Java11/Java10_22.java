package com.Java11;

import net.mindview.util.TextFile;

import java.util.*;

/**
 * Created by  Tang
 * Create Time 2018/7/24 下午 10:53
 */
public class Java10_22 {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>(new TextFile("src/main/java/com/hode/SetOperations.java","\\W+"));
        Collections.sort(strings,String.CASE_INSENSITIVE_ORDER);
        Map<String,Integer> map = new LinkedHashMap<String, Integer>();
        Set<String> set = new TreeSet<String>();

        for (String s:strings){
            Integer num = map.get(s);
            if(!set.contains(s))
                set.add(s);
            map.put(s,num==null?1:num++);
        }
        System.out.println(set);
    }
}
