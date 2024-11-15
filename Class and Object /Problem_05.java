/* Write a Java program to create a class called "Book" with attributes for title, author, 
and ISBN, and methods to add and remove books from a collection.*/

package com.mycompany.mid;

import java.util.ArrayList;
import java.util.Scanner;

class Book {

    String title, author, isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;

    }

    void tv() {
        System.out.print("Name : " + title + "  Author : " + author + "  ISBN : " + isbn);

    }

}

public class Mid {

    public static void main(String[] args) {
        ArrayList<Book> book = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        String title, author, isbn;
        System.out.print("Enter size : ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            scan.nextLine();

            System.out.print("Title : ");
            title = scan.nextLine();
            System.out.print("Author : ");
            author = scan.nextLine();
            System.out.print("ISBN : ");
            isbn = scan.nextLine();
            Book s = new Book(title, author, isbn);
            book.add(s);

        }

        System.out.print("Inserted Data : \n\n");
        for (Book x : book) {
            x.tv();
            System.out.println("");
        }
        System.out.print("For Removing  Data \n ");
        System.out.print("ISBN : ");
        String temp = scan.nextLine();
        int flag = 1;
        for (Book X : book) {
            if (temp.equals(X.isbn)) {
                flag = 0;
                book.remove(X);
                break;
            }
        }
        if (flag == 1) {

            System.out.print("Invalid ");
        } else {
            System.out.println("After Removing Book ");

            for (Book x : book) {
                x.tv();
                System.out.println("");
            }
        }

    }
}
