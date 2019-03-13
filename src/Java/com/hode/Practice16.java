package com.hode;

import net.mindview.util.TextFile;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by  Tang
 * Create Time 2018/7/12 下午 8:03
 */
public class Practice16 {

    private static int VowelsNum=0;
    private static int VowelsTimes=0;

    public static  void getVowels(Set<String> sets){

        Set<Character> BaseWords =
                new TreeSet<Character>(Arrays.asList('a','i','o','e','u','A','I','O','E','U'));

        for (String set : sets ){
            VowelsNum=0;
            for(Character word :set.toCharArray()){
                if(BaseWords.contains(word)){
                    VowelsNum++;
                    VowelsTimes++;
                }
            }
            System.out.println(set+"中含有"+VowelsNum+"个元音字符");
        }

    }
    public static void main(String[] args) {

        Set<String> set = new TreeSet<String>
                (new TextFile("src/main/java/com/hode/UniqueWords.java","\\W+"));

//        System.out.println(set);
        getVowels(set);
        System.out.println("元音字符总共出现了"+VowelsTimes+"次");
    }

}
