package ru.gb.lesson6.anno;

import java.lang.reflect.Field;
import java.util.concurrent.ThreadLocalRandom;

public class RandomIntAnnotationProcessor {

    public static void process(Object obj) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();

        for (Field declaredField : declaredFields) {
            if (declaredField.isAnnotationPresent(RandomInt.class)) {
                RandomInt annotation = declaredField.getAnnotation(RandomInt.class);

                int minValue = annotation.min();
                int maxValue = annotation.max();
                int randomValue = minValue + ThreadLocalRandom.current().nextInt(maxValue - minValue);

                try {
                    declaredField.setAccessible(true);
                    declaredField.set(obj, randomValue);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
