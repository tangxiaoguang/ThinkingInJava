package com.Java13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by  Tang
 * Create Time 2018/8/2 下午 9:51
 */
public class Test10 {
    public static void main(String[] args) {
        String str = "Java now has regular expressions";

        for(String arg: args){
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(str);
            while(m.find()){System.out.println("reg");
                System.out.println("Match \"" + m.group() +"\" at positions " + m.start() + "-" + (m.end()-1) );
            }
            System.out.println("\n");
        }

    }
}