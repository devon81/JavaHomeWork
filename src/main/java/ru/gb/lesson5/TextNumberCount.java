package ru.gb.lesson5;

import java.util.*;
import java.util.stream.Collectors;

public class TextNumberCount {

    /**
     * Задан текст. Нужно посчитать популярности длин строк.
     */
    public static void main(String[] args) {
        String text = "Являясь всего лишь частью общей картины, " +
                "акционеры крупнейших компаний освещают чрезвычайно интересные особенности " +
                "картины в целом, однако конкретные выводы, разумеется, " +
                "указаны как претенденты на роль ключевых факторов. " +
                "Идейные соображения высшего порядка, " +
                "а также разбавленное изрядной долей эмпатии, рациональное " +
                "мышление создаёт предпосылки для экспериментов, поражающих " +
                "по своей масштабности и грандиозности.";

        // 1 -> [в, а]
        // 2 -> [по, на]
        // 3 -> [как, для]


        String[] words = text.split("\\s++"); // [точка или запятая]{0 или 1 раз} и один или больше пробелов


        Map<Integer, List<String>> wordsGroupByLength = Arrays.stream(words)
                .map(it -> it.replace(",", ""))
                .map(it -> it.replace(".", ""))
                .map(String::toLowerCase)
//                .map(it -> it.toLowerCase())
//                .collect(Collectors.groupingBy(it -> it.length()));
                .collect(Collectors.groupingBy(String::length));

        System.out.println(wordsGroupByLength);


//        HashMap<Integer, List<String>> stats = new HashMap<>();
//        for (String word : words) {
//            // Отбросили знаки препинания
//            String pureWord = word.toLowerCase();
////                    word.replace(".", "")
////                    .replace(",", "")
////                    .toLowerCase();
//
//            int length = pureWord.length();
//            if (!stats.containsKey(length)) {
//                stats.put(length, new ArrayList<>(Arrays.asList(pureWord)));
//            } else {
//                List<String> otherWords = stats.get(length);
//                otherWords.add(pureWord);
//                stats.put(length, otherWords); // Необязательно
//            }
//        }
//        System.out.println(stats);
    }




}
