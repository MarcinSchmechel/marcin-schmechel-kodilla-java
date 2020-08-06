package com.kodilla.paterns2.adapter.bookclassifier;

import com.kodilla.paterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.paterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Roman","Bieszczady",2002, "W01"));
        bookSet.add(new Book("Zenon","Góry",2001, "W02"));
        bookSet.add(new Book("Jan","Lasy",1998, "W03"));
        bookSet.add(new Book("Paweł","Morze",2003, "W04"));
        bookSet.add(new Book("Zbyszek","Polany",2005, "W05"));
        bookSet.add(new Book("Kazik","Wzgórza",2010, "W06"));

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int booksPublicationMedian = medianAdapter.publicationYearMedian(bookSet);

        //Then
        System.out.println(booksPublicationMedian);
        assertEquals(2003,booksPublicationMedian);
    }
}
