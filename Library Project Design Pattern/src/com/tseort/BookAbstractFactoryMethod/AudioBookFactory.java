package com.tseort.BookAbstractFactoryMethod;

import com.tseort.BookFactory.AudioBook;
import com.tseort.BookFactory.IBook;

public class AudioBookFactory extends AbstractFactory {

    @Override
    public IBook createBook(String category) {

        IBook book = new AudioBook();
        book.setLoanPeriod(category);
        return book;
    }
}
