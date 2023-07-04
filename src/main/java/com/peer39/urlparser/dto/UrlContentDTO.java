/*
 author Anastasiya
 created on 30/06/2023
 */


package com.peer39.urlparser.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 Data transfer object (DTO) representing the content of a URL.
 Contains the URL and the text content of the URL.
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UrlContentDTO {
    private String url;
    private String urlText;
}
