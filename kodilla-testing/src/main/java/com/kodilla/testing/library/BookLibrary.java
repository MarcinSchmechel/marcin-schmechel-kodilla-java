package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookLibrary {
    LibraryDatabase libraryDatabase;
    Map<LibraryUser, Book> rentedBooksList = new HashMap<>();
    List<Book> bookListInHandsOfUser = new ArrayList<>();

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {

        for(Map.Entry<LibraryUser, Book> entry: rentedBooksList.entrySet()){
//            if(libraryUser.equals(entry.getKey())){
                bookListInHandsOfUser.add(entry.getValue());
//            }
        }
        return bookListInHandsOfUser;
    }

    public void rentABook(LibraryUser libraryUser, Book book) {
//        if (libraryDatabase.rentABook(libraryUser, book)) {
            rentedBooksList.put(libraryUser, book);
//        }
    }
}