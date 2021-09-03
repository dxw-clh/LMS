package com.dxw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Component
public class Books {

    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
