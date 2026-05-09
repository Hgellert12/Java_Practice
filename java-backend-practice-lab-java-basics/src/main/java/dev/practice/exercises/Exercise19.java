package dev.practice.exercises;

import dev.practice.models.Book;

public class Exercise19 {

    public static void run() {
        Book book = new Book("Clean Code", "Robert C. Martin", 464);

        book.borrowBook();
        book.printSummary();
        book.returnBook();
        book.printSummary();
    }
}
