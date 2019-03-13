package com.Java14;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by  Tang
 * Create Time 2018/8/10 上午 7:15
 */
public class FilledList<T> {
    private Class<T> type;
    FilledList(Class<T> type) {
        this.type = type;
    }
    public List<T> create(int nElements){
     List<T> restult = new ArrayList<T>();
     try{
         for(int i =0;i<nElements;i++)
         restult.add(type.newInstance());
     }catch (Exception e){
         throw new RuntimeException(e);
     }
     return  restult;
    }

    public static void main(String[] args) {
        FilledList<CountedInteger> fl = new FilledList<CountedInteger>(CountedInteger.class);
        Class<CountedInteger> abc = CountedInteger.class;
        System.out.print(fl.create(15));
    }
}

class CountedInteger{
    private static long counter;
    private final long id = counter++;
    public String toString(){
        return Long.toString(id);
    }
}