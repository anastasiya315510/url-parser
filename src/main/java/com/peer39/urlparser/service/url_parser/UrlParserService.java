/*
 author Anastasiya
 created on 30/06/2023
 */

package com.peer39.urlparser.service.url_parser;

import com.peer39.urlparser.dto.UrlContentDTO;

import java.io.IOException;
/*
Interface for the URL parser service.
Provides a method to parse the content of a URL and return the result as a {@link UrlContentDTO}.
Throws an {@link IOException} if there is an error while parsing the URL.
 */
public interface UrlParserService {
    UrlContentDTO parseFromUrl(String url) throws IOException;
}
