package com.Java13;

import static net.mindview.util.Print.print;

/**
 * Created by  Tang
 * Create Time 2018/8/1 下午 10:12
 */
public class Replacing {
    static String s = Splitting.knights;

    public static void main(String[] args) {
//        print(Splitting.split("the|you"));
        print(s.replaceFirst("t\\w+","tang"));
        print(s.replaceAll("A|E|I|O|U|a|e|i|o|u","_"));
    }
}
