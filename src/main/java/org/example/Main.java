package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static int readValidInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.next().trim();
            scanner.nextLine();

            try {
                int value = Integer.parseInt(input);
                if (value <= 0) {
                    System.out.println("Число повинно бути більше 0. Спробуйте ще раз");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Введено нечислове значення. Спробуйте ще раз");
            }
        }
    }

    private static String readValidString(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine().trim();

            if (line.isEmpty()) {
                System.out.println("Текст не може бути порожнім. Спробуйте ще раз");
                continue;
            }
            return line;
        }
    }

    private static void createNewBook(Scanner scanner, int bookNumber, List<Book> bookList) {
        System.out.println("\nСтворення книги " + bookNumber);
        int id = readValidInt(scanner, "id: ");
        String name = readValidString(scanner, "name: ");
        String author = readValidString(scanner, "author: ");
        int pages = readValidInt(scanner, "pages: ");

        bookList.add(new Book(id, name, author, pages));
    }

    private static void printBookList(List<Book> bookList) {
        System.out.println("\nСписок книг:");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {

        // Створення списку об'єктів
        List<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Консольне меню
        while (true) {
            int choice = readValidInt(scanner, """
                    
                    Оберіть:
                    1 - Створити новий об'єкт
                    2 - Вивести інформацію про всі об'єкти
                    3 - Завершити роботу
                    """);

            switch (choice) {
                case 1:
                    createNewBook(scanner, books.size() + 1, books);
                    break;
                case 2:
                    printBookList(books);
                    break;
                case 3:
                    System.out.println("\nЗавершення роботи програми");
                    System.exit(0);
            }
        }
    }
}