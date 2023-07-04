/*
 author Anastasiya
 created on 01/07/2023
 */


package com.peer39.urlparser.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
/**
 Data transfer object (DTO) representing the categorized URL.
 Contains the URL and a list of categories associated with the URL.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UrlCategoryDTO {
    private String url;
    private List<String>categories;
}
