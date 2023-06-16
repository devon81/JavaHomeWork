/**
 * Пусть дан произвольный список целых чисел.
 *
 * 1) Нужно удалить из него чётные числа (void removeEven(ArrayList<Integer> list))
 * 2) Найти минимальное значение         (Integer findMin(ArrayList<Integer> list))
 * 3) Найти максимальное значение
 * 4) Найти среднее значение
 *
 * То есть, нужно реализовать 4 метода, каждый из которых принимает список целых чисел, и делает свою работу.
 */

package ru.gb.lesson3;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {

       Random randoming = new Random();
       Integer[] integers = new Integer[5];

       for (int i = 0; i < integers.length; i++){
           integers[i] = randoming.nextInt(100);
       }

        System.out.println("Полный массив чисел:");

       for (int i = 0; i < integers.length; i++) {
           ArrayList<Integer> list = new ArrayList<>(Arrays.asList(integers[i]));
           System.out.println(list);
           }


        removeEven(integers);
        FindMin(integers);
        FindMax(integers);
        FindAverage(integers);
    }

    public static void removeEven(Integer[] integers){

        System.out.println("Массив нечетных чисел: ");
        for (int i = 0; i < integers.length; i++){
            if(integers[i] % 2 != 0) {
                System.out.println(integers[i]);

            }
        }
    }

    public static int FindMin(Integer[] integers){
        int min = integers[0];

        for(int i = 0; i < integers.length; i++){
            if (integers[i] < min) {
                min = integers[i];
            }
        }
        System.out.println("Минимальный элемент списка = " + min);
      return min;
    }

    public static int FindMax(Integer[] integers){
        int max = integers[0];

        for(int i = 0; i < integers.length; i++){
            if(integers[i] > max){
                max = integers[i];
            }
        }
        System.out.println("Максимальный элемент списка = " + max);
        return max;
    }

    public static double FindAverage(Integer[] integers){
        int summ = integers[0];
        double average = 0.0;

        for(int i = 1; i < integers.length; i++){
            summ = summ + integers[i];
        }
        average = summ/integers.length;
        System.out.println("среднее значение элементов  списка = " + average);
        return average;
    }

}
