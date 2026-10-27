package org.example;

import java.util.Objects;

public class Book {
    private int id;
    private String name;
    private String author;
    private int pages;

    // Конструктор з параметрами
    public Book(int id, String name, int pages) {
        this.id = id;
        this.name = name;
        this.pages = pages;
    }

    // Гетери та сетери
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) &&
                Objects.equals(name, book.name) &&
                Objects.equals(author, book.author) &&
                Objects.equals(pages, book.pages);
    }

    // hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, pages);
    }

    // toString
    @Override
    public String toString() {
        return "Book{id=" + id + ", name=" + name + ", author=" + author + ", pages=" + pages + "}";
    }
}
