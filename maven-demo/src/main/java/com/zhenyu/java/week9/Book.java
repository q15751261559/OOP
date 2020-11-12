package com.zhenyu.java.week9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Book{
    private String ISBN;
    private String bookName;
    private Integer price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    Book(String ISBN, String bookName, int price){
        this.ISBN=ISBN;
        this.bookName=bookName;
        this.price=price;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getISBN() {
        return ISBN;
    }
    public static void main(String[] args) {
        Book book =new Book("7777777777","java",99);
        Book book1=new Book("1234567890123","JS",99);
        Book book2=new Book("7777777777","暴力恐怖",99);
        Book book3=new Book("11111111","javaweb",150);

        BookShelves ss=new BookShelvesImpl();
        boolean flag=false;
        try{
            flag=ss.checkBook(book2);
        }catch (TooLongIsbn | BootstrapMethodError | PriceException | NameException e){
            System.err.println(e.getMessage());
        }
        System.out.println(flag);

    }
}
