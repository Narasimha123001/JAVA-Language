package com.JavaFundamentals.OOPS.features.Task.LibrarySystem;

public class Main {
    public static void main(String[] args) {

        EBook ebook = new EBook("One Love","Narasimhan",(double) 5.8);
        PrintedBook printedBook = new PrintedBook("No Love","Nani",520);


        ebook.displayInfo();
        ebook.displayFileSize();

        printedBook.displayInfo();
        printedBook.displayNumPages();
    }
}
            /*
            output:
                    Book Details:
                    Title of the book: One Love
                    Author of the book: Narasimhan
                    Size of the EBook: 5.8 MB
                    Book Details:
                    Title of the book: No Love
                    Author of the book: Nani
                    No of the Pages: 520

             */