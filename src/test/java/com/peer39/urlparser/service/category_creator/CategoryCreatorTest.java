package com.peer39.urlparser.service.category_creator;

import com.peer39.urlparser.models.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.peer39.urlparser.constants.Constants.*;
import static org.junit.jupiter.api.Assertions.*;

class CategoryCreatorTest {


    @Test
    public void testCreate() {
        // Given
        var categoryService = new CategoryCreatorImpl();

        // When
        var category = categoryService.create(CATEGORY_NAME, KEY_WORDS);

        // Then
        Assertions.assertNotNull(category);
        Assertions.assertEquals(CATEGORY_NAME, category.getName());
        Assertions.assertEquals(KEY_WORDS, category.getCategoryKeywords());
        Assertions.assertEquals(CATEGORY, category);
    }
}