package com.Java14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;
import static net.mindview.util.Print.*;

/**
 * Created by  Tang
 * Create Time 2018/8/14 下午 10:17
 */
 class ShowMethods {
    private static String usage =
            "usage:\n" +
            "ShowMethods qualified.class.name\n" +
            "To show all methods in class or:\n" +
            "ShowMethods qualified.class.name word\n" +
            "To search for methods involving 'word'";
    private static Pattern p = Pattern.compile("(\\w+\\.)|(final)|(native)");

    public static void main(String[] args) {
        if(args.length<1){
            print(usage);
            System.exit(0);
        }
        int lines = 0;
        try{
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] ctors = c.getConstructors();
            if(args.length==1){
                for(Method method : methods){
                    print(p.matcher(method.toString()).replaceAll(""));
                }
                for (Constructor ctor : ctors){
                    print(p.matcher(ctor.toString()).replaceAll(""));
                }
                lines = methods.length+ctors.length;
            }else{
                for (Method method:methods){
                    System.out.println(p.matcher(method.toString()).replaceAll(""));
                    lines++;
                }
                for (Constructor ctor:ctors){
                    System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                }
            }
        }catch (ClassNotFoundException e){
            System.out.println(e.toString());
        }
    }
}