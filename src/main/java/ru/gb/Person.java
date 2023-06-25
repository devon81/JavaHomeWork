package ru.gb;

//public class Person {

//    private Long id;
//    private String name;
//    private Integer age;
//    private Boolean enabled;
//
//    public Person(Long id, String name, Integer age, Boolean enabled) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.enabled = enabled;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public Boolean getEnabled() {
//        return enabled;
//    }
//}


import java.util.HashMap;
        import java.util.Map;
        import java.util.Scanner;

public class TelephoneDirectory {
    private Map<String, String> directory;

    public TelephoneDirectory() {
        directory = new HashMap<>();
    }

    public void addEntry(String lastName, String phoneNumber) {
        if (directory.containsKey(lastName)) {
            // Если фамилия уже существует, добавляем новый номер телефона к списку
            String existingNumbers = directory.get(lastName);
            String updatedNumbers = existingNumbers + ", " + phoneNumber;
            directory.put(lastName, updatedNumbers);
        } else {
            // Если фамилии нет в справочнике, создаем новую запись
            directory.put(lastName, phoneNumber);
        }
    }

    public void removeEntry(String lastName) {
        directory.remove(lastName);
    }

    public void searchEntry(String lastName) {
        if (directory.containsKey(lastName)) {
            String phoneNumbers = directory.get(lastName);
            System.out.println("Phone number(s) for " + lastName + ": " + phoneNumbers);
        } else {
            System.out.println("No entry found for " + lastName);
        }
    }

    public void printAllEntries() {
        if (directory.isEmpty()) {
            System.out.println("Telephone directory is empty.");
        } else {
            for (Map.Entry<String, String> entry : directory.entrySet()) {
                String lastName = entry.getKey();
                String phoneNumbers = entry.getValue();
                System.out.println(lastName + ": " + phoneNumbers);
            }
        }
    }

    public static void main(String[] args) {
        TelephoneDirectory directory = new TelephoneDirectory();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("Telephone Directory");
            System.out.println("Available commands:");
            System.out.println("ADD <LastName> <PhoneNumber>");
            System.out.println("GET <LastName>");
            System.out.println("REMOVE <LastName>");
            System.out.println("LIST");
            System.out.println("EXIT");
            System.out.print("Enter command: ");

            String command = scanner.nextLine();
            String[] tokens = command.split(" ");
            String action = tokens[0].toUpperCase();

            switch (action) {
                case "ADD":
                    if (tokens.length == 3) {
                        String lastName = tokens[1];
                        String phoneNumber = tokens[2];
                        directory.addEntry(lastName, phoneNumber);
                        System.out.println("Entry added successfully.");
                    } else {
                        System.out.println("Invalid command. Usage: ADD <LastName> <PhoneNumber>");
                    }
                    break;
                case "GET":
                    if (tokens.length == 2) {
                        String lastName = tokens[1];
                        directory.searchEntry(lastName);
                    } else {
                        System.out.println("Invalid command. Usage: GET <LastName>");
                    }
                    break;
                case "REMOVE":
                    if (tokens.length == 2) {
                        String lastName = tokens[1];
                        directory.removeEntry(lastName);
                        System.out.println("Entry removed successfully.");
                    } else {
                        System.out.println("Invalid command. Usage: REMOVE <LastName>");
                    }
                    break;
                case "LIST":
                    directory.printAllEntries();
                    break;
                case "EXIT":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
            }

            System.out.println();
        }

        System.out.println("Exiting Telephone Directory. Goodbye!");
    }
}
