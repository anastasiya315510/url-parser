package com.peer39.urlparser.service.categorise;

import com.peer39.urlparser.models.Category;
import com.peer39.urlparser.service.url_parser.UrlParserService;
import com.peer39.urlparser.service.url_parser.UrlParserServiceJsoupImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static com.peer39.urlparser.constants.Constants.*;


class UrlClassifierServiceTest {
    private UrlParserService urlParserService;
    private UrlClassifierService urlClassifier;
    Map<String, Category> categoryHashMap;


    @BeforeEach
    public void setUp() {
        // Prepare the test data
        categoryHashMap = new HashMap<>();
        categoryHashMap.put("category1", new Category("category1", Arrays.asList("keyword1", "keyword2")));
        categoryHashMap.put("category2", new Category("category2", Arrays.asList("keyword3", "keyword4")));
        categoryHashMap.put(CATEGORY_NAME, CATEGORY );

        // Given
        urlParserService = new UrlParserServiceJsoupImpl();
        urlClassifier = new UrlClassifierServiceImpl(urlParserService);
    }

    @Test
    public void testCategorizeUrl() {
        // When
        var result = urlClassifier.categorizeUrl(URL);

        // Then
        Assertions.assertNotNull(result);
        Assertions.assertEquals(URL, result.getUrl());

    }


}