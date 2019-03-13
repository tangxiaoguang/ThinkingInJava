package com.annotations;

import java.lang.annotation.*;

/**
 * Created by  Tang
 * Create Time 2018/9/5 上午 8:07
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
    public int id();
    public String description() default "no description";
}
