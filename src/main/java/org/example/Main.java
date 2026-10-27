package org.example;

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

    public static void main(String[] args) {
        // Створення масиву
        Book[] books = new Book[5];
        Scanner scanner = new Scanner(System.in);

        // Заповнення масиву
        for (int i = 0; i < books.length; i++) {
            int id = readValidInt(scanner, "\nКнига " + (i + 1) + " id: ");
            String name = readValidString(scanner, "Книга " + (i + 1) + " name: ");
            String author = readValidString(scanner, "Книга " + (i + 1) + " author: ");
            int pages = readValidInt(scanner, "Книга " + (i + 1) + " pages: ");

            books[i] = new Book(id, name, author, pages);
        }

        // Тестування toString
        System.out.println("\nТест toString (виведення всього списку книг)");
        for (Book book : books) {
            System.out.println(book);
        }

        // Тестування equals
        System.out.println("\nТест equals (порівняння книги 1 і 2)");
        boolean areEqual = books[0].equals(books[1]);
        if (areEqual) {
            System.out.println("Книги 1 і 2 однакові");
        }
        else {
            System.out.println("Книги 1 і 2 не однакові");
        }

        // Тестування гетерів і сетерів
        System.out.println("\nТест гетерів і сетерів (оновлення назви 1 книги та запит нової)");
        books[0].setName("Оновлена назва");
        System.out.println("Назва книги 1: " + books[0].getName());
    }
}