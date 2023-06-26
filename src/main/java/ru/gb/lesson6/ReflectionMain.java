package ru.gb.lesson6;

import jakarta.persistence.EntityManager;

import java.lang.reflect.Constructor;
import java.util.List;

public class ReflectionMain {

    public static void main(String[] args) throws Exception {
        MyAnno annotation = MyClass.class.getAnnotation(MyAnno.class);

        System.out.println(annotation.parameter());

        Class<MyClass> tClass = MyClass.class;

        Constructor<?>[] constructors = tClass.getConstructors();

        Constructor<MyClass> constructor = tClass.getConstructor(String.class);

        MyClass name1 = new MyClass("name");
        MyClass name = constructor.newInstance("name");


        List<Person> persons; // select * from person

    }

}
