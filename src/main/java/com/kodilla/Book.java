package com.kodilla;

public class Book {
    private String author;
    private String title;

    private Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static Book of(String author, String title) {
        return new Book(author, title);
    }

    public String provideAuthor() {
        return author;
    }

    public String provideTitle() {
        return title;
    }
    public static void main(String[] args) {
        Book book1 = Book.of("Tracy Brian", "Nawyki warte miliony");
        System.out.println("Author:" + " " + book1.provideAuthor());
        System.out.println("Title:" + " " + book1.provideTitle());
    }

    }

