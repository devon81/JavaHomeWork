package ru.gb.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson3Main {

    public static void main(String[] args) {
        // PEP
        // JEP Java ...
        // 1 Preview
        // 2 Second preview
        // 3 Release

//        intro();
//        timer();

//        ArrayList<String> strings = new ArrayList<>(
//                Arrays.asList("a", "a", "b", "b", "b", "b", "c", "a", "b", "d", "a")
//        );
//
//        removeDuplicates(strings);
//        System.out.println(strings); // [a, b, c, d]


        ArrayList<String> strings = new ArrayList<>(
                Arrays.asList("str", "1", "-5", "abcde", "")
        );
        cleanup(strings);
        System.out.println(strings); // ["1", "-5"]
    }

    /**
     * Дан список, в котором некоторые строки являются целыми числами.
     * Нужно удалить все строки.
     * <p>
     * ["str", "1", "-5", "abcde", ""] -> ["1", "-5"]
     */
    private static void cleanup(ArrayList<String> strings) {
        strings.removeIf(next -> !isInteger(next));

//        Iterator<String> iterator = strings.iterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            if (!isInteger(next)) {
//                iterator.remove();
//            }
//        }

//        for (String next : strings) {
//
//        }


//        for (int i = 0; i < strings.size(); i++) {
//            String element = strings.get(i);
//            if (!isInteger(element)) {
//                strings.remove(i);
//                i--;
//            }
//        }
    }

    private static boolean isInteger(String string) {
        return string.matches("[-]{0,1}\\d+");
    }

    /**
     * Удалить из списка дубликаты
     */
    private static void removeDuplicates(ArrayList<String> strings) {
        // Iterable<T>
        ArrayList<String> unique = new ArrayList<>();
        for (String s : strings) { // foreach
            if (!unique.contains(s)) {
                unique.add(s);
            }
        }
        strings.clear();
        strings.addAll(unique);

//        int index = 0;
//        while (index < strings.size()) {
//            String element = strings.get(index);
//            int index2 = index + 1;
//            while (index2 < strings.size()) {
//                String element2 = strings.get(index2);
//                if (element.equals(element2)) {
//                    strings.remove(index2);
//                } else {
//                    index2++;
//                }
//            }
//            index++;
//        }
    }

    private static void timer() {
        // Измерить время добавления 1_000_000 элементов
        // в списки

        // Количество милисекунд, прошедних с 1 января 1970 года по UTC-0
        // Moscow -> UTC+3
        System.currentTimeMillis();

        int count = 10_000_000;
        timeCapacity(10, count);
        timeCapacity(1000, count);
        timeCapacity(count, count);
    }

    private static void timeCapacity(int capacity, int count) {
        ArrayList<Integer> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println(list.size());
        System.out.println("Время добавления " + capacity + ": " + time);
    }

    private static void intro() {
        // generic обобщение
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list10 = new ArrayList<>(100);
        // capacity
        // [length = 10] [1, 1, ..., 1, 1, null, ..., null] = 20
//        ArrayList<Integer> list2 = new ArrayList<>(20);
        System.out.println(list.size()); // 0

        list.add(1);
        System.out.println(list.size()); // 1

        list.add(0, 2); // [2, 1]
        System.out.println(list.size()); // 2

        list.remove(0);
        System.out.println(list.size()); // 1
        System.out.println(list); // [1]


        list.set(0, -1); // arr[5] = -1 IndexOutOfBounds


        // size
        // add(element)
        // add(index, element)
        // remove(element), remove(index)
        // set(index, element)
        // clear
        // sort
    }

}
