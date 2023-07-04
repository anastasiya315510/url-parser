/*
 author Anastasiya
 created on 30/06/2023
 */


package com.peer39.urlparser.controller;

import com.peer39.urlparser.dto.UrlCategoryDTO;
import com.peer39.urlparser.dto.UrlContentDTO;
import com.peer39.urlparser.service.categorise.UrlClassifierService;
import com.peer39.urlparser.service.url_parser.UrlParserService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.apache.commons.validator.routines.UrlValidator;
import org.springframework.web.bind.annotation.*;


/**
 * RestController for managing urls
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/url")
public class UrlManager {

    private final UrlParserService urlParserService;
    private final UrlValidator urlValidator;
    private final UrlClassifierService urlClassifierService;



    /**
     {@code PostMapping /url/parse}
     Handles the POST request for parsing a URL.
     Parses the content of the specified URL and returns the {@link UrlContentDTO}.
     @param url the URL to be parsed
     @return the parsed {@link UrlContentDTO} object
     @throws IllegalArgumentException if the provided URL is invalid
     */
    @PostMapping("/parse")
    @SneakyThrows
    public UrlContentDTO parseUrl(@RequestParam String url){
        if(urlValidator.isValid(url)) {
            return urlParserService.parseFromUrl(url);
        }
        throw new IllegalArgumentException("URL is invalid");


    }



    /**
     {@code GetMapping /url/classify}
     Handles the GET request for categorizing a URL.
     Categorizes the specified URL and returns the {@link UrlCategoryDTO} containing the categories.
     @param url the URL to be categorized
     @return the categorized {@link UrlCategoryDTO} object
     */
    @GetMapping("/classify")
    public UrlCategoryDTO categoriseURL(@RequestParam String url){
        return urlClassifierService.categorizeUrl(url);

    }




}
