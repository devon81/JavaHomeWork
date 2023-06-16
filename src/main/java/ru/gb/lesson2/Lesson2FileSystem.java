package ru.gb.lesson2;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Lesson2FileSystem {

    // java

    public static void main(String[] args) throws IOException {
        Path structure = Path.of("root");

//        Files.delete(structure);

//        if () {
//
//        } else {
//
//        }
//        или так лучше?
//        if ()
//        {
//
//        }
//        else
//        {
//
//        }

//        Path path = Path.of("new_file.txt");
//        if (Files.notExists(path)) {
//            Files.createFile(path);
//        }

//        try (OutputStream os = Files.newOutputStream(path)) {
//            String output = "output content 1234";
//            byte[] bytes = output.getBytes();
//            os.write(bytes);
//        }



//        try {
//            doThrow();
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("exception!");
//        }
//
//        System.out.println("fadsf");


        // java.io.File   since java 1.0
        // java.nio.Path  since java 1.7
//        File file = new File(".gitignoreasdfasdf");
//        Path path = Path.of(".gitignore"); // Paths.get(".gitignore")
//        Path path = Path.of("src");
//
//        // InputStream
//        // checked unchecked
//
//        try {
//            throw new IllegalArgumentException("illegal argument");
//        } catch (IllegalArgumentException e) {
//            System.out.println("ошибка! " + e.getMessage());
//        } finally {
//
//        }
//        InputStream inputStream = null;
//        try {
//            inputStream = Files.newInputStream(path);
//            byte[] allBytes = inputStream.readAllBytes();
//            System.out.println(new String(allBytes));
//        } catch (IOException exception) {
//            System.out.println("Произошла ошибка при открытии файла: "
//                    + exception.getClass() + " " + exception.getMessage());
//        } finally {
//            if (inputStream != null) {
//                try {
//                    inputStream.close();
//                } catch (IOException e) {
//                    // ignore
//                }
//            }
//        }

//        try (InputStream inputStream = Files.newInputStream(path)) {
//            byte[] allBytes = inputStream.readAllBytes();
//            System.out.println(new String(allBytes));
//        } catch (IOException exception) {
//            System.out.println("Произошла ошибка при открытии файла: "
//                    + exception.getClass() + " " + exception.getMessage());
//        }

//
//
//        inputStream.close();


//        Scanner scanner = new Scanner(inputStream);
//        System.out.println(scanner.nextLine());
//        System.out.println(scanner.nextLine());
//        System.out.println(scanner.nextLine());
//        System.out.println(scanner.nextLine());

//        scanner.close();

//        System.out.println(get());

    }

    static int doThrow() {
        throw new IllegalArgumentException("exception");
    }

}
