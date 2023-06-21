package ru.gb.lesson5;

import java.util.*;

public class Lesson5Main extends Object {

    public static void main(String[] args) {
        // List, Queue, Deque -> Collection
        // Map <String, String>
//        intro();
//        hashMap();

        System.out.println(isIsomorph("add", "egg")); // true
        System.out.println(isIsomorph("note", "code")); // true
        System.out.println(isIsomorph("foo", "bar")); // false
        System.out.println(isIsomorph("paper", "title")); // true
        System.out.println(isIsomorph("abcde", "bcdef")); // true
        System.out.println(isIsomorph("aaaaa", "abcde")); // false
        System.out.println(isIsomorph("abcde", "aaaaa")); // true
    }

    /**
     * Даны 2 строки, написать метод, который вернет true,
     * если эти строки являются изоморфными и false, если нет.
     * Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
     *
     * add, egg -> true   a -> e, d -> g
     * note, code -> true n -> c, o -> o, t -> d, e -> e
     * foo, bar -> false  f -> b, o -> a,
     * paper, title -> true
     * abcde, bcdef -> true
     * aaaaa, abcde -> false
     * abcde, aaaaa -> true a, b, c, d, e -> a
     */
    private static boolean isIsomorph(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();

        for (int i = 0; i < firstChars.length; i++) {
            char a = firstChars[i]; // o
            char b = secondChars[i]; // r
            if (!map.containsKey(a)) {
                map.put(a, b);
            } else {
                if (map.get(a) != b) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void hashMap() {
        // 16   - default capacity
        // 0.75 - default load factor
        // capacity
        // load factory
        HashMap<String, Integer> map = new HashMap<>(32, 0.2f);

        // [] = 32
        // 20% от 32 -> 6.4 ~ 7
        // [] = 64
        // 20% от 43 -> 12.8 ~ 13


        // buckets, 16 = [null, null, ... null]
        map.put("python", 6);
        // key -> hash = hash(key) - int
        // hash -> bucket
        // if hash = 7 -> bucket = 7
        // if hash = 18 -> bucket = 18 % 16 -> bucket = 2
        // В нужную "корзинку" добавляется пара <key, value>

        map.put("java", 4);
        // key -> hash = key.hashCode() - int
        // Если корзинка уже занята
        // Проверяем ключи по equals
        // Если ключи равны по equals то заменяем
        // Если не равны, то внутрь корзинки помещается список пар <key, value>

        // [null, null, [java=4, python=6], null, ..., null]

        Map.Entry<String, Integer> entry;
        List<Map.Entry<String, Integer>> bucket;
        List<Map.Entry<String, Integer>>[] buckets;

        System.out.println("java".hashCode());


        // Redis
        // Телефонный справочник
        // Иванов -> 8 800 555 35 35
        // Петров -> 8 800 000 10 15
    }

    private static void intro() {
        HashMap<String, String> hashMap = new HashMap<>();

        // Добавление пары ключ-значение
        hashMap.put("key", "value");

        // Получение значения по ключу
        String valueByKey = hashMap.get("key");
        System.out.println(valueByKey); // "value"

        // Проверка наличия ключа
        boolean containsKey = hashMap.containsKey("key");
        System.out.println(containsKey); // true

        // Получение множества всех ключей (ключи уникальны)
        Set<String> keys = hashMap.keySet();

        // Удаление пары по ключу
        hashMap.remove("key");

        // Удалить все пары
        hashMap.clear();

        // Проверить наличие значения
        hashMap.containsValue("value");

        // Получение коллекции всех значений
        Collection<String> values = hashMap.values();

        // Получение множества всех пар
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
        }
    }

}
