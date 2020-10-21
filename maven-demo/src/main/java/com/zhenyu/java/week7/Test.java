package com.zhenyu.java.week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Test
 * @Description TODO
 * @Author 86139
 * @Date 2020/10/15
 **/

public class Test {
    public static void main(String[] args) {
        Student student = Student.builder()
                .StudentName("southWind")
                .ID("2002922201")
                .Gender("male")
                .build();
        Book[] books = {Book.builder().bookName("java").values(100).build(),
                Book.builder().bookName("java web").values(200).build(),
                Book.builder().bookName("java spirit").values(300).build(),
        };
        List<Book> bookList=new ArrayList<>(Arrays.asList(books));
        student.setBooks(books);
        for(Book book : student.getBooks()){
            System.out.println(book.getBookName());
        }
    }
}
