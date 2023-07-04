/*
 author Anastasiya
 created on 01/07/2023
 */


package com.peer39.urlparser.service.category_creator;

import com.peer39.urlparser.models.Category;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Service Implementation for Creation category.
 */
@Service
public class CategoryCreatorImpl implements CategoryCreator {
    /**
     * Categorize url, for each link it sets up the group, relevant to content in the link
     *
     * @param name  it will be name of our Category.
     * @param keywords  it will be keywords list, that contains current category.
     * @return {@link Category} object,
     */
    @Override
    public Category create(String name, List<String> keywords) {
        return Category.builder().categoryKeywords(keywords).name(name).build();
    }

}
