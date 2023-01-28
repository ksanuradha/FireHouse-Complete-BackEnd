package com.example.FireHouse.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookMarkDTO {
    private int id;
    private String name;
    private String url;
    private String description;
    private int status;
    private Date expiryDate;
}
