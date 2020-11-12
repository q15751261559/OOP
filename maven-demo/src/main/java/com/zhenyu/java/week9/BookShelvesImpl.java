package com.zhenyu.java.week9;

public class BookShelvesImpl implements BookShelves {
    public boolean checkBook(Book book) throws NameException,TooLongIsbn,PriceException{
        if(book.getISBN().length()>13){
            throw new  TooLongIsbn("长度过长!");
        }
        else if(book.getBookName().equals("暴力恐怖")){
            throw new  NameException("不能出现暴力恐怖内容!");
        }
        else if(book.getPrice()>100){
            throw new PriceException("价格过高!");
        }
        else {
            return true;}
    }
}
