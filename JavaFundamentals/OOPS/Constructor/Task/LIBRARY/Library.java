package com.JavaFundamentals.OOPS.Constructor.Task.LIBRARY;

public class Library {
    //instance Variables
    String BookTitle;
    String Author;

    //static Variables
    static String libraryName = "starLibrary";

    //Parameterized Constructor

    public Library( String BookTitle , String Author){
        this.BookTitle = BookTitle;
        this.Author = Author;
        displayBookInfo();
    }
    // default Constructor

    public Library(){
        BookTitle = "Unknown";
        Author = "Unknown";
        displayBookInfo();
    }

    //static method
    public static String getLibraryName(){

        return libraryName;
    }
    // instance method
    void displayBookInfo(){
        System.out.println("Book title: "+BookTitle);
        System.out.println("Book Author: "+Author);
        System.out.println("Library Name: " +Library.getLibraryName());
    }
}
