package com.okuru.springmypostman.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Post {

    private int id;
    private String postName;
    private String userName;
    private String description;
    private String body;


}
