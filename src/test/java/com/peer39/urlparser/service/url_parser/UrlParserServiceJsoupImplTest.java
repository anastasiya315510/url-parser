package com.peer39.urlparser.service.url_parser;

import com.peer39.urlparser.dto.UrlContentDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.io.IOException;

import static com.peer39.urlparser.constants.Constants.URL;


class UrlParserServiceJsoupImplTest {


    private UrlParserService parser;



    @BeforeEach
    void setUp() {
        parser = new UrlParserServiceJsoupImpl();

    }

    @Test
    void parseFromUrl() throws IOException {
        // When
        UrlContentDTO result = parser.parseFromUrl(URL);

        // Then
        Assertions.assertNotNull(result);
        Assertions.assertEquals(URL, result.getUrl());

        // Verify that content is not empty and contains some text
        Assertions.assertFalse(result.getUrlText().isBlank());
    }


    @Test
    public void testParseFromUrlWithInvalidUrl() {
        String invalidUrl = "invalid-url";

        // When & Then
        Assertions.assertThrows(Exception.class, () -> parser.parseFromUrl(invalidUrl));
    }

}