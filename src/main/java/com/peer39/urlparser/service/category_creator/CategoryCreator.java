/*
 author Anastasiya
 created on 01/07/2023
 */

package com.peer39.urlparser.service.category_creator;

import com.peer39.urlparser.models.Category;

import java.util.List;

/*
Interface for the category creator.
Provides a method to create a category with the given name and list of keywords.
*/
public interface CategoryCreator {
    Category create(String name, List<String> keywords );
}
