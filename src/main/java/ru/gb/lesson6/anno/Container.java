package ru.gb.lesson6.anno;

public class Container {

    @RandomInt
    private int first;

    @RandomInt(min = 5, max = 7)
    private int second;

    @RandomInt(max = 100)
    private int third;

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public int getThird() {
        return third;
    }
}
