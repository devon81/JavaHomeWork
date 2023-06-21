package ru.gb.lesson4;
import java.util.*;

public class HomeWork {

    /**
     * Реализовать консольное приложение, которое:
     * 1. Принимает от пользователя и “запоминает” строки.
     * 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
     * 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
     * 4. Если введено exit, то программа завершается
     *
     *
     *
     * > - ввод в консоль (stdin), < - вывод на консоль (stdout)
     * > java
     * > python
     * > c#
     * > print
     * < [c#, python, java]
     * > revert
     * > print
     * < [python, java]
     * > revert
     * > revert
     * > print
     * < []
     * > revert -> throw new NoSuchElementException
     */

    public static void main(String[] args){

        Deque<String> list = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String commandLine = scanner.nextLine();
            switch (commandLine) {
                case "exit" -> {
                    return;
                }
                case "print" -> System.out.println(list);
                case "revert" -> list.removeFirst();
                default -> list.addFirst(commandLine);
            }
        }

            }
        }









