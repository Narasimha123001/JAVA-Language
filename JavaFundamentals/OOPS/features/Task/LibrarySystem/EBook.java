package com.JavaFundamentals.OOPS.features.Task.LibrarySystem;

public class EBook extends Book{

    double fileSize ;

    public EBook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    void displayFileSize(){
        System.out.println("Size of the EBook: "+fileSize+" MB");
    }
}
