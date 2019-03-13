package com.annotations;

import net.mindview.atunit.Test;

/**
 * Created by  Tang
 * Create Time 2018/9/4 下午 10:18
 */
public class Testable {
    public void execute(){
        System.out.println("Testable ....");
    }
    @Test void testExecut(){
        execute();
    }
}
