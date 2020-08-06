package com.kodilla.paterns2.adapter.bookclasifier;

import com.kodilla.paterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.paterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.paterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.paterns2.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();

        for(Book theBook : bookSet){
            books.put(new BookSignature(theBook.getSignature()),
                    new com.kodilla.paterns2.adapter.bookclasifier.libraryb.Book(theBook.getAuthor(),
                            theBook.getTitle(),
                            theBook.getPublicationYear()));
        }
        return medianPublicationYear(books);
    }
}
