package com.hode;

import java.util.*;

/**
 * Created by  Tang
 * Create Time 2018/6/29 上午 7:35
 */
public class Build {
    static Collection<Movie> next(Collection<Movie> collection){

//        collection.add("这个杀手不太冷");
//        collection.add("蝙蝠侠黑暗骑士");
//        collection.add("盗梦空间");
        collection.add(new Movie("霸王别姬"));
        collection.add(new Movie("复仇者联盟"));
        return collection;
    }

    static Map next(Map<String,String> map){
        map.put("这个杀手不太冷","娜塔莉，波特曼");
        map.put("蝙蝠侠黑暗骑士","贝尔");
        map.put("盗梦空间","莱恩纳德");
        return map;
    }

    public static void main(String[] args) {

//        System.out.print(next(new ArrayList<String>()));
//        System.out.print(next(new LinkedList<String>()));
//        System.out.println(next(new HashMap<String,String>()));
//        System.out.print(next(new HashSet<String>()));
        Collection<Movie> collection = new ArrayList<Movie>();
        System.out.print(next(collection));
    }
}

class Movie{
    private String string;
    Movie(String string){this.string =  string;}
    @Override
    public String toString() {
        return string;
    }
}