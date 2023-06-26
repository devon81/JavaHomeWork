package ru.gb.lesson6;

import java.util.*;

public class Lesson6Main {

    public static void main(String[] args) {
        // Collection <- Set

        // keys от HashMap
        HashSet<String> hashSet = new HashSet<>();
        // keys от TreeMap
        // Красно-черное дерево
        TreeSet<String> treeSet = new TreeSet<>();
        // keys от LinkedHashMap
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

//        treeSet.add();
//        treeSet.contains();


        // ["a", null, "c", "c"]
        // first = c
        // first.next = a
        // first.next.next = b
        // tail = b

        List<String> list = new ArrayList<>();
        list.add("c");
        list.add("a");
        list.add("a"); //
        list.add("b");
        list.add("b"); //
        list.add("b"); //
        printUniqueElements(list);
    }

    /**
     * Распечатать в консоль уникальные элементы (в любом порядке)
     * @param elements
     */
    static void printUniqueElements(List<String> elements) {
        elements.stream()
                .distinct()
                .forEach(System.out::println);

//        HashSet<String> unique = new HashSet<>(elements);
////        for (String element : elements) {
////            unique.add(element);
////        }
//        System.out.println(unique);
    }

}
