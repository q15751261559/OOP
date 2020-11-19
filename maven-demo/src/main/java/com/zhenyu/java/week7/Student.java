package com.zhenyu.java.week7;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.PrintConversionEvent;
import java.util.List;

/**
 * @ClassName Student1
 * @Description TODO
 * @Author 86139
 * @Date 2020/10/15
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private String ID;
    private String StudentName;
    private String Gender;
    private Book[] books;
    private int age;

    public void setBooksList(List<Book> bookList) {
    }
}