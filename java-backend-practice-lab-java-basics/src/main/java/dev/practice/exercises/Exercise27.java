package dev.practice.exercises;

import dev.practice.models.Book;
import dev.practice.models.LibraryMember;

public class Exercise27 {

    public static void run() {
        LibraryMember member = new LibraryMember("John Smith");

        Book cleanCode = new Book("Clean Code", "Robert C. Martin", 464);
        Book effectiveJava = new Book("Effective Java", "Joshua Bloch", 416);

        member.borrow(cleanCode);
        member.borrow(effectiveJava);
        member.printBorrowedBooks();
    }
}
