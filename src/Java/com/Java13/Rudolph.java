package com.Java13;

/**
 * Created by  Tang
 * Create Time 2018/8/2 上午 7:47
 */
public class Rudolph {
    public static void main(String[] args) {
        for(String pattern:new String[]{
                "Rudolph","[Rr]udolph","[rR][aeiou]do.*"
        })
            System.out.println("Rudolph".matches(pattern));
    }
}
