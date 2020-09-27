package com.kodilla.patterns2.adapter.company.bookclasifier;

import com.kodilla.patterns2.adapter.company.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.company.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMediana(Set<com.kodilla.patterns2.adapter.company.bookclasifier.librarya.Book> bookSet) {
        Map<BookSignature,com.kodilla.patterns2.adapter.company.bookclasifier.libraryb.Book> books = new HashMap<>();
        for (com.kodilla.patterns2.adapter.company.bookclasifier.librarya.Book book : bookSet) {
            books.put(new BookSignature("Random"),new com.kodilla.patterns2.adapter.company.bookclasifier.libraryb.Book(book.getAuthor(),book.getTitle(),book.getPublicationYear()));
        }
        return medianPublicationYear(books);
    }
}
