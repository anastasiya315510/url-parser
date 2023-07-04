/*
 author Anastasiya
 created on 30/06/2023
 */


package com.peer39.urlparser.service.url_parser;

import com.peer39.urlparser.dto.UrlContentDTO;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.jsoup.Jsoup;

/**
 * Service Implementation for parsing urls.
 */
@Service
public class UrlParserServiceJsoupImpl implements UrlParserService {

    /**
     * url the url, needs to be parsed.
     * @return the {@link UrlContentDTO} with  body the url and urlText, or exception if link is invalid
     */
    @Override
    @SneakyThrows
    public UrlContentDTO parseFromUrl(String url){
        var doc = Jsoup.connect(url).get().body();  //get connection
        var content = doc.text();  //executing the get request, and get text without tags

        if(content.isBlank()){   //if content is empty, we got all HTML text, won't happen usually
            content = doc.html();
        }
        return UrlContentDTO.builder().urlText(content).url(url).build();
    }
}
