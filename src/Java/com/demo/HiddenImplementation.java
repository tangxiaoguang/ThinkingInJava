package com.demo;

import com.Java14.*;

import java.lang.reflect.Method;

/**
 * Created by  Tang
 * Create Time 2018/9/1 下午 10:17
 */
public class HiddenImplementation {
    public static void main(String[] args) throws Exception {

        A a = HiddenC.makeA();
//        a.f();
//        System.out.println(a.getClass().getName());

        callHiddenMethod(a,"g");
        callHiddenMethod(a,"u");
        callHiddenMethod(a,"v");
        callHiddenMethod(a,"toString");

    }

    static void callHiddenMethod(Object a,String methodName) throws Exception {
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }
}
