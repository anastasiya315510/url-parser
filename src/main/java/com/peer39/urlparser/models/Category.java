/*
 author Anastasiya
 created on 01/07/2023
 */


package com.peer39.urlparser.models;

import lombok.*;

import java.util.List;


/**
 Represents a category.
 Contains the name of the category and a list of keywords associated with the category.
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Category {
    private String name;
    private List<String> categoryKeywords;
}
