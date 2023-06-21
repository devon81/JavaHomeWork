package ru.gb.lesson4;

import java.util.*;

public class Lesson4 {

    public static void main(String[] args) {
//        lists();
//        stackAndQueue();


    }



    private static void stackAndQueue() {
        // Collection -> List Интерфейс -> [ArrayList, LinkedList]
        // Collection -> Queue -> Deque -> [ArrayDeque, LinkedList]
        // Collection -> Set


        // Stack LIFO Last In First Out
        // Queue FIFO First In First Out

        // push add
        // get pop remove

        // Stack
        // add 1 2 3 4 5
        // pop 5 4 3 2 1

        // Queue
        // add 1 2 3 4 5
        // pop 1 2 3 4 5

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.removeFirst();
        list.removeLast();

        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(3);
        queue.add(4);
        queue.add(1);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }

    private static void lists() {
        // [v1, v2, ..., vn]
        ArrayList<String> arrayList = new ArrayList<>();

        // head, tail
        // [v1] <-> [v2] <-> ... <-> [vn]
        LinkedList<String> linkedList = new LinkedList<>();

        arrayList.get(4);  // сразу обращаемся по индексу
        linkedList.get(4); // отсчитываем 4 шага от первого

        // Имеется список из 1_000_000 элементов. Нужно удалять элемент по индексу.
        // 1. Чтобы удалить из ArrayList, нужно удалить элемент по индексу, и потом сдвинуть все, что было справа.
        // [v1, v2, ..., v_i+1, ..., vn]
        // 2. Чтобы удалить из LinkedList, нужно "дошагать" до элемента по индексу,
        // поменять ссылки у предыдущего и следующего
        // [v1] <-> [v2] <-> ... [v_i-1] <-> [v_i+1]<-> [vn]

        MyLinkedListNode second = new MyLinkedListNode();
        second.value = 2;

        MyLinkedListNode first = new MyLinkedListNode();
        first.value = 1;
        first.next = second;

        MyLinkedListNode nextOfFirst = first.next;

        // first[1] -> second[2] -> null
    }

}


