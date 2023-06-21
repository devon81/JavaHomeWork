package ru.gb.lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi {

    public static void main(String[] args) {
        String text = "Являясь всего лишь частью общей картины, " +
                "акционеры крупнейших компаний освещают чрезвычайно интересные особенности " +
                "картины в целом, однако конкретные выводы, разумеется, " +
                "указаны как претенденты на роль ключевых факторов. " +
                "Идейные соображения высшего порядка, " +
                "а также разбавленное изрядной долей эмпатии, рациональное " +
                "мышление создаёт предпосылки для экспериментов, поражающих " +
                "по своей масштабности и грандиозности.";

        // Получить из текста все слова, длинее 5 символов
        String[] wordsArray = text.split("[.,]{0,1}\\s++");
        List<String> words = Arrays.asList(wordsArray);

        words.stream()
                .filter(word -> word.length() <= 5)  // промежуточная операция
                .forEach(word -> System.out.print(word + " ")); // терминальная операция
        System.out.println();

        words.stream()
                .filter("освещают"::equals)
                .findAny()
                .ifPresentOrElse(word -> System.out.println("Слово " + word + " найдено!"), () -> System.out.println("Слово не найдено"));

        // Все слова, короче, чем 6 символов, перевести в верхний регистр, развернуть и собрать в список
        List<String> modified = words.stream()
                .filter(word -> word.length() < 6)
                .map(String::toUpperCase)
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.toList());
        System.out.println(modified);

        List<Integer> ints = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        // 21
        //
        Integer sum = ints.stream()
                .reduce(Integer::sum)
                .get();
        System.out.println(sum);

        //


        int[] array = IntStream.rangeClosed(0, 10).toArray(); // [0, 10)
        System.out.println(Arrays.toString(array));

        int[] array2 = IntStream.rangeClosed(1, 9)
                .map(it -> it * it)
                .toArray();
        System.out.println(Arrays.toString(array2));

        IntStream.generate(() -> ThreadLocalRandom.current().nextInt(100))
                .limit(1000)
                .forEach(it -> System.out.print(it + " "));


    }

}
