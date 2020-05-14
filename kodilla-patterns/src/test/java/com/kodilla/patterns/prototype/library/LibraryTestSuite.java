package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Book bloodOfElfs = new Book("Blood of elfs", "Andrzej Grabowski", LocalDate.of(2018,3,3));
        Book howDrinkMoreAndBetter = new Book("How drink more and better?", "Kamil Księciuniu", LocalDate.of(2010,5,23));
        Book lordsOfRings = new Book("Lords of rings", "J.R.R. Tolkien", LocalDate.of(1920,8,30));
        Book howGetChickenDinner = new Book("How get chicken dinner?", "Lukasz Kruszynski", LocalDate.of(2019,2,15));
        Book lordsOfHeaven = new Book("Lords of heaven", "Martin Garix", LocalDate.of(1987,12,1));

        Library library = new Library("Reserved books");
        library.books.add(bloodOfElfs);
        library.books.add(howDrinkMoreAndBetter);
        library.books.add(lordsOfHeaven);
        library.books.add(lordsOfRings);
        library.books.add(howGetChickenDinner);

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Loan books");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library.getBooks().remove(lordsOfRings);
        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        Assert.assertEquals(4,library.getBooks().size());
        Assert.assertEquals(5,cloneLibrary.getBooks().size());






    }
}