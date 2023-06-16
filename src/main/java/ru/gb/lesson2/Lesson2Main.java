package ru.gb.lesson2;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Lesson2Main extends Object {

    public static void main(String[] args) {
        // codewars, codeforces
//        stringPool();

//        System.out.println(buildString(8, '1', '2'));

//        System.out.println(extractDomainName("manager@gb.com"));
//        System.out.println(extractDomainName("chief@google.com"));

        String s = "   abcdefghijklmnop          ";

        int length = s.length(); // длина строки // 16
        char c = s.charAt(2);    // элемент строки по индексу // c
        String substring = s.substring(5);// подстрока, начиная с 5 символа // fghijklmnop
        String substring1 = s.substring(5, 7); // подстрока [5, 7) // fg
        String lowerCase = s.toLowerCase(); // переводит всю строку в нижний регистр
        String upperCase = s.toUpperCase(); // переводит всю строки в верхний регистр
        boolean startWith = s.startsWith("abcde"); // начинается ли строка с данного префикс // true
        boolean endsWith = s.endsWith("mnop");
        String trim = s.trim(); // обрезает пробелы спереди и сзади
        String concat = s.concat("-xx"); //    abcdefghijklmnop          -xx
        char[] chars = s.toCharArray(); // получить массив символов


        String text = "I am java developer";
        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println(upperCase);


        System.out.println(compress("aaaabbbcdd"));
        System.out.println(compress("abcde"));
        System.out.println(compress("aaaaaa"));

    }

    /**
     * Напишите метод, который сжимает строку. Пример:
     * aaaabbbcdd -> a4b3cd2
     * abcde -> abcde
     * aaaaaa -> a6
     */
    static String compress(String source) {
        String result = "";
        int count = 1;
        for (int i = 1; i < source.length(); i++) {
            if (source.charAt(i - 1) == source.charAt(i)) {
                count++;
            } else {
                result += source.charAt(i - 1);
                if (count > 1) {
                    result += count;
                }
                count = 1;
            }
        }
        result += source.charAt(source.length() - 1);
        if (count > 1) {
            result += count;
        }
        return result;
    }

    /**
     * Дано: электронная почта. Нужно найти доменное имя сотрудника.
     * [manager@gb.com] -> manager
     * [chief@google.com] -> chief
     */
    static String extractDomainName(String mail) {
        // 1. Нужно индекс собаки.
        // 2. Взять часть строки до собаки

        // @ и все что после него
        // @234yhfpiuejmpac89u

        return mail.replaceAll("@.*", "");
//        int indexOfAt = mail.indexOf("@"); // -1
//        return mail.substring(0, indexOfAt);
    }

    /**
     * Дано четное число n b символы c1 c2. Нужно создать строку c1c2c1c2...c1c2 длины n
     */
    static String buildString(int n, char c1, char c2) {
        String append = String.valueOf(c1) + c2;
        return append.repeat(n / 2);

//        String str = "";
//        for (int i = 0; i < n / 2; i++) {
//            str += c1;
//            str += c2;
//        }
//        return str;
    }


    private static void stringPool() {
        // JVM -> String pool -> String table [s1]
        String s1 = "string"; // ~ [s1]
        String s2 = "string"; // ~ [s1]
        String s3 = new String("string"); // ~ [s3]
        String s4 = new String("string"); // ~ [s4]


        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s3 == s4); // false
        String intern = s3.intern(); // ~ [s1]
        System.out.println(intern == s1); // true
        System.out.println(intern == s3); // false

        System.out.println();
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s3.equals(s4)); // true
    }

}
