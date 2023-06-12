/**
 * 1. Реализовать метод isPalindrome
 * 2. Пересмотреть мой спич про работу с файловой системой. Подготовить вопросы.
 */

/**
 * Проверить, является ли строка палиндромом.
 * Палиндром - это строка, которая читается одинаково слева и справа
 * abcdedcba -> true
 * a -> true
 * abc -> false
 * abcd -> false
 * abba -> true
 */

package ru.gb;

import java.util.Scanner;
import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
        System.out.print(isPalindrome(""));
    }

    static boolean isPalindrome(String source) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите какое-то значение ");

        if (scanner.hasNext()){
            source = scanner.nextLine();
            System.out.print(source);
        }

        var chars = source.toCharArray();
        var left = 0;
        var right = chars.length - 1;

        while(left < right){
            if(chars[left] == chars[right]){
                System.out.print(" ");
                return true;
            }
            left++;
            right--;
        }
        System.out.print(" ");
        return false;
    }
}