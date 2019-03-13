package com.Java13;

import java.util.Arrays;

/**
 * Created by  Tang
 * Create Time 2018/8/1 上午 7:57
 */
public class Splitting {
    public static String knights = "Then, when you have found the shrubbery, you must " +
            "cut down the mightiest tree in the forest..." +
            "with... a herring!";

    public static void split(String regex){

        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
        split(" ");
        split("\\W+");
        split("n\\W+");
        split("the|you");
    }
}
