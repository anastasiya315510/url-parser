/*
 author Anastasiya
 created on 04/07/2023
 */

package com.peer39.urlparser.constants;

import com.peer39.urlparser.models.Category;

import java.util.List;

public interface Constants {
    String CATEGORY_NAME = "Star Wars";
    List<String> KEY_WORDS = List.of("star war", "starwars", "starwar", "starwars", "r2d2");
    Category CATEGORY = Category.builder().categoryKeywords(KEY_WORDS).name(CATEGORY_NAME).build();

    String URL = "http://www.starwars.com";
}
