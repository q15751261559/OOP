package com.zhenyu.java.week9;

public interface BookShelves {
    boolean checkBook(Book book) throws NameException, TooLongIsbn, PriceException;
}
