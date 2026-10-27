package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Створення масиву
        Book[] books = new Book[5];
        Scanner scanner = new Scanner(System.in);

        // Заповнення масиву
        for (int i = 0; i < books.length; i++) {
            System.out.print("\nКнига " + (i + 1) + " id: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Книга " + (i + 1) + " name: ");
            String name = scanner.nextLine();

            System.out.print("Книга " + (i + 1) + " author: ");
            String author = scanner.nextLine();

            System.out.print("Книга " + (i + 1) + " pages: ");
            int pages = scanner.nextInt();

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