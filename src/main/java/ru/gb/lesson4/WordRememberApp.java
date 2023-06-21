package ru.gb.lesson4;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class WordRememberApp {

    /**
     * Реализовать консольное приложение, которое:
     * <p>
     * 1. Принимает от пользователя строку вида text~num
     * <p>
     * 1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
     * 2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
     * 3. Если введено exit, то завершаем программу
     * <p>
     * java~4
     * python~2
     * c#~2
     * print~4 -> java
     * print~2 -> c#
     * print~3 -> throw new NoSuchElementException
     * print~2 -> throw new NoSuchElementException
     */

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        // List<String> -> List<List<String>> -> List<Pair>
        List<List<String>> storage = new LinkedList<>(); //new ArrayList<>();
        root: while (true) {
            String command = scanner.nextLine();
            if ("exit".equals(command)) {
                break;
            }

            String[] arguments = command.split("~");
            if (arguments.length != 2) {
                System.err.println("Некорректный ввод. Должна быть строка вида [word~index]");
                continue;
            }

            String word = arguments[0];
            String index = arguments[1];
            try {
                Integer.parseInt(index);
            } catch (NumberFormatException e) {
                System.err.println("Некорректный ввод. Второй аргумент команды не является числом");
                continue;
            }

            if ("print".equals(word)) {
                Iterator<List<String>> iterator = storage.iterator();
                while (iterator.hasNext()) {
                    List<String> pair = iterator.next();
                    String pairIndex = pair.get(1);
                    if (index.equals(pairIndex)) {
                        iterator.remove();
                        System.out.println(pair.get(0));
                        continue root;
                    }
                }
                throw new NoSuchElementException();
            } else {
                for (List<String> pair : storage) {
                    String pairIndex = pair.get(1);
                    if (index.equals(pairIndex)) {
                        pair.set(0, word);
                        continue root;
                    }
                }
                storage.add(new ArrayList<>(Arrays.asList(word, index)));
            }
            System.out.println("Storage = " + storage);
        } // while

        System.exit(0);





    }

}
