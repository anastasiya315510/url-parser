/*
 author Anastasiya
 created on 01/07/2023
 */


package com.peer39.urlparser.service.categorise;

import com.peer39.urlparser.dto.UrlCategoryDTO;
import com.peer39.urlparser.models.Category;
import com.peer39.urlparser.service.url_parser.UrlParserService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

import static com.peer39.urlparser.UrlParserApplication.categoryHashMap;

/**
 * Service Implementation for assigning categories, for each url
 */
@Service
@RequiredArgsConstructor
public class UrlClassifierServiceImpl implements UrlClassifierService {

    private final UrlParserService urlParserService;

    /**
     * Categorize url, for each link it sets up the group, relevant to content in the link
     *
     * @param url  url for parsing.
     * @return {@link UrlCategoryDTO} object,
     */
    @Override
    @SneakyThrows
    public UrlCategoryDTO categorizeUrl(String url) {
        var urlContent = urlParserService.parseFromUrl(url);
        var words =urlContent.getUrlText().toLowerCase();
        var categories = new ArrayList<String>();

        categoryHashMap.forEach((key, value) -> addRelevantCategory(value, words, categories));
        return UrlCategoryDTO.builder().url(url).categories(categories).build();

    }


    /**
     * for each word, we're checking, that it contains as a key word in current category and add in categories List
     */
    private void addRelevantCategory(Category category, String words, List<String> categories) {
        if(category.getCategoryKeywords().stream().anyMatch(words::contains)){
            categories.add(category.getName());
        }
    }
}
