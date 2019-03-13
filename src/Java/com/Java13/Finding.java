package com.Java13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.printnb;

/**
 * Created by  Tang
 * Create Time 2018/8/4 下午 9:40
 */
public class Finding {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\w+").matcher("Evening is full of the linnet's wings");
        while (m.find()){
            printnb(m.group()+"     ");
        }

    }
}
