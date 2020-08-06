package com.kodilla.paterns2.adapter.bookclasifier;

import com.kodilla.paterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.paterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.paterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.paterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        Statistics averageProcessor = new Statistics();
        return averageProcessor.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        Statistics averageProcessor = new Statistics();
        return averageProcessor.medianPublicationYear(books);
    }
}
