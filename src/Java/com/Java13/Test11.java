package com.Java13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * Created by  Tang
 * Create Time 2018/8/2 下午 9:56
 */
public class Test11 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
        Matcher m = p.matcher("Arline ate eight apples and " +
                "one orange while Anita hadn't any");

//        while (m.find()){
//            System.out.println(m.group());
//        }
        int i =0;
        while(m.find()){
            System.out.println(m.groupCount());
//            for (int j=0;j<=m.groupCount();j++) {
//                printnb("[" + m.group(j) + "]");
//                print();
//            }
//            System.out.println("Match \"" + m.group(i) +
//                    "\" at positions " + m.start() + "-" +
//                    (m.end() - 1));
//            i++;
        }
    }
}