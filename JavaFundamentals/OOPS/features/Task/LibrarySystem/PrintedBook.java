package com.JavaFundamentals.OOPS.features.Task.LibrarySystem;

public class PrintedBook extends Book{
    int numPages;

    public PrintedBook(String title, String author,int numPages) {
        super(title, author);
        this.numPages=numPages;
    }
    void displayNumPages(){
        System.out.println("No of the Pages: "+numPages);
    }
}
