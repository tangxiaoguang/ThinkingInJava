package com.Java14;

/**
 * Created by  Tang
 * Create Time 2018/8/10 上午 7:39
 */
public class GenericToyTest {
    public static void main(String[] args) {
        Class<Tang> ftClass = Tang.class;
        try {
            Tang tang = ftClass.getDeclaredConstructor().newInstance();
            Class<? super Tang> up = ftClass.getSuperclass();
//             obj = up.getDeclaredConstructor().newInstance();
        }catch (Exception e){

        }

    }
}

