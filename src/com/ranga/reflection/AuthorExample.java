package com.ranga.reflection;

/**
 * Created by rgonugunta on 6/26/16.
 */
public class AuthorExample {

    public @interface Author {
        String first();

        String last();
    }

    @AuthorExample.Author(first = "Oompah", last = "Loompah")
    Book book = new Book();

    public class Book {

    }
}
