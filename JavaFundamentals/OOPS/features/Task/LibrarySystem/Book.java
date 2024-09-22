package com.JavaFundamentals.OOPS.features.Task.LibrarySystem;

public class Book {

    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    void displayInfo(){
        System.out.println("Book Details: ");
        System.out.println("Title of the book: "+title);
        System.out.println("Author of the book: "+author);
    }

}
