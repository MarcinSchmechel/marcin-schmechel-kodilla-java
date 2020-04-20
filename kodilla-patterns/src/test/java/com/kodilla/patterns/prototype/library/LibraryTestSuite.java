package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
    //Given
        Library library = new Library("Library 1");
        Book book1 = new Book("Book1", "Author1", LocalDate.of(1999,1,1));
        Book book2 = new Book("Book2", "Author2", LocalDate.of(2010,5,21));
        Book book3 = new Book("Book3", "Author3", LocalDate.of(2015,8,17));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }
    //When
        library.getBooks().remove(book3);
    //Then

        System.out.println("Library 1" + library.getBooks());
        System.out.println("Library 2" + shallowClonedLibrary.getBooks());
        System.out.println("Library 3" + deepClonedLibrary.getBooks());
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}