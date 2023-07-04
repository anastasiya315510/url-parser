/*
 author Anastasiya
 created on 01/07/2023
 */

package com.peer39.urlparser.service.categorise;

import com.peer39.urlparser.dto.UrlCategoryDTO;

/*
Interface for the URL classifier service.
Provides a method to categorize a URL and return the result as a {@link UrlCategoryDTO}.
*/
public interface UrlClassifierService {
    /*
Categorizes the specified URL and returns the result as a {@link UrlCategoryDTO}.
@param url the URL to be categorized
@return the categorized {@link UrlCategoryDTO} object
*/
    UrlCategoryDTO categorizeUrl(String url);
}
