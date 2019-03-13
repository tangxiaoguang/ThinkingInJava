package com.Java13;

import static net.mindview.util.Print.print;

/**
 * Created by  Tang
 * Create Time 2018/8/2 上午 7:59
 */
public class TestRegularExpression {
    public static void main(String[] args) {
        if(args.length<2){
            print("Usage:\njava TestRegularExpression "+ "characterSequence regularExpress+");
            System.exit(0);
        }
        print("Input: \"" +args[0] + "\"");
    }
}
