package ru.gb.lesson6.anno;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface RandomInt {

    int min() default 0;

    int max() default Integer.MAX_VALUE;

}
