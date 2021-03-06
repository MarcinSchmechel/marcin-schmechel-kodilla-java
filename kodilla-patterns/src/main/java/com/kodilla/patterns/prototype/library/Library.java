package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException{
        return (Library)super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException{
        Library deepClonedLibrary = (Library)super.clone();
        Set<Book> clonedBooks = new HashSet<>();

        for (Book book : books) {
            clonedBooks.add(new Book(book));
        }
        deepClonedLibrary.books = new HashSet<>();
        deepClonedLibrary.books.addAll(clonedBooks);
        return deepClonedLibrary;
    }
}