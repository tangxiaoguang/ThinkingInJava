package com.hode;

import net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by  Tang
 * Create Time 2018/7/12 上午 7:20
 */
public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(new TextFile("src/main/java/com/hode/SetOperations.java","\\W+"));

System.out.println(words);

    }
}
