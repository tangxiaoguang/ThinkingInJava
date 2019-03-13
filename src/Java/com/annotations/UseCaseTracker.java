package com.annotations;

import net.mindview.atunit.Test;

import java.lang.reflect.*;
import java.util.*;

/**
 * Created by  Tang
 * Create Time 2018/9/5 上午 8:01
 */
public class UseCaseTracker {
    public static void trackUseCase(List<Integer> useCases,Class<?> cl){
        for(Method m :cl.getDeclaredMethods()){
            UseCase uc = m.getAnnotation(UseCase.class);
            if(uc != null){System.out.println(m.getName());
                System.out.println("Found Use Case:"+uc.id()+ " "+uc.description());
                useCases.remove(Integer.valueOf(uc.id()));
            }
        }
        for(int i :useCases){
            System.out.println("Warning: Missing use case-"+i);
        }
    }
    public static void main(String[] args){
        List<Integer> useCases = new ArrayList<Integer>();
        Integer[] integers = {47,48,49,50};
        Collections.addAll(useCases,integers);
        trackUseCase(useCases,PasswordUtils.class);
    }
}
