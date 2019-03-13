package com.Java13;

import static java.util.regex.Pattern.matches;

/**
 * Created by  Tang
 * Create Time 2018/7/31 下午 10:58
 */
public class IntegerMatch {
    public static void main(String[] args) {
        System.out.println("+1234".matches("-?\\d+"));
        System.out.println("-1234".matches("(-|\\+)?\\d+"));
        System.out.println("-thr234".matches("(-|\\+|\\w+)?\\w+\\d+"));
    }
}
