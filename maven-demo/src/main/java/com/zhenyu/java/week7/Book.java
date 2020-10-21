package com.zhenyu.java.week7;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName Book
 * @Description TODO
 * @Author 86139
 * @Date 2020/10/15
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
    private String bookName;
    private Integer values;
    private Date publicData;

}