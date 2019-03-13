package com.Java13;

import java.util.Arrays;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;

/**
 * Created by  Tang
 * Create Time 2018/8/4 下午 9:14
 */
public class SplitDemo {
    public static void main(String[] args) {
        String input = "this!!unusual use!!of exclamation!!points";
//        input.split()
        print(Arrays.toString(Pattern.compile("!!").split(input)));
        print(Arrays.toString(Pattern.compile("!!").split(input,3)));

    }
}
