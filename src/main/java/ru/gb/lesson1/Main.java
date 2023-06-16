package ru.gb.lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // JDK Java Development Kit = javac + JRE + Standard Library
    // JRE Java Runtime Environment = JVM + Standard Library

    // .jar (.zip)

    // java -jar myjar.jar

    // private   нигде
    // protected внтури пакета + наследование
    // default   внутри пакета
    // public    всем всегда отовсюду

    /**
     * Написать программу, которая запросит пользователя ввести <Имя> в консоли.
     * Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
     */
    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4, 5};
        reverse(first);
        System.out.println(Arrays.toString(first));

        int[] second = {1, 2, 3, 4};
        reverse(second);
        System.out.println(Arrays.toString(second));


//        int[][] twoDimensialArray = new int[3][3];
        // [[0, 5, 0], [1, 0, 0], [0, 0, -1]]

        // 0 5 0
        // 1 0 0
        // 0 0 -1

//        twoDimensialArray[0][1] = 5;
//        twoDimensialArray[1][0] = 1;
//        twoDimensialArray[2][2] = -1;

        int index = 0;
        int[] arr = {1, 2};

        System.out.println(arr[++index]); // 2
        System.out.println(index); // 1

        int a = 5;
        int res = --a - a--;
        System.out.println(res);
        System.out.println(a);


//        boolean sumBetween10And20 = Homework.isSumBetween10And20(5, 3);

    }

    /**
     * Дан массив. Нужно его развернуть
     * <p>
     * [1, 2, 3, 4, 5] -> [5, 4, 3, 2, 1]
     * [1, 2, 3, 4] -> [4, 3, 2, 1]
     */
    static void reverse(int[] arr) {
        // 0 <-> size - 1 - 0
        // 1 <-> size - 1 - 1
        // 2 <-> size - 1 - 2
        // i <-> size - 1 - i
        //
        int size = arr.length;
        for (int j = 0; j < size / 2; j++) {
            int tmp = arr[j];
            arr[j] = arr[size - 1 - j];
            arr[size - 1 - j] = tmp;
        }
    }

    /**
     * Дан массив nums = [3,2,2,3] и число val = 3.
     * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
     * Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
     * <p>
     * 3 2 2 3 [3] -> 2 2 3 3
     * 1 2 3 4 5 [3] -> 1 2 4 5 3
     * <p>
     * [5] 1 2 5 3 3 3 4 5 5
     */
    static void changeOrder(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                for (int j = i; j < arr.length - 1; j++) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    /**
     * Дан массив двоичных чисел, например [1,1,0,1,1,1], найти максимальное количество подряд идущих 1.
     */
    static int maxCounter(int[] array) {
        int res = 0;
        int max = 0;
//        for (int i = 0; i < array.length; i++) {
        for (int x : array) {
            if (x == 1) {
                res++;
                if (max < res) {
                    max = res;
                }
            } else {
                res = 0;
            }
        }

        return max;
    }

    /**
     * Написать программу, которая запросит пользователя ввести <Имя> в консоли.
     * Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
     */
    private static void helloWorld() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Привет, " + name + "!");
    }

}