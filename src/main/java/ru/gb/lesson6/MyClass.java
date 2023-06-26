package ru.gb.lesson6;

@MyAnno(parameter = "asdfadf")
public class MyClass {

    public MyClass(String arg) {
        System.out.println("New instance!!!: " + arg);
    }

}
