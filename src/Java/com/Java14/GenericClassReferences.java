package com.Java14;

/**
 * Created by  Tang
 * Create Time 2018/8/9 下午 10:25
 */
public class GenericClassReferences {
    public static void main(String[] args) {
//        Class intClass = int.class;
//        Class<Integer> genericIntClass = int.class;
//        genericIntClass = Integer.class;
//        intClass = double.class;
        Class<?> intClass = int.class;
        intClass = double.class;

    }
}
