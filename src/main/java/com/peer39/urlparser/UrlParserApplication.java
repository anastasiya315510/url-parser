package com.peer39.urlparser;

import com.peer39.urlparser.models.Category;
import com.peer39.urlparser.service.category_creator.CategoryCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.List;

@SpringBootApplication
public class UrlParserApplication implements CommandLineRunner {

    @Autowired
    private CategoryCreator categoryCreator;

    public static volatile HashMap<String, Category>categoryHashMap = new HashMap<>();

    public static void main(String[] args) {
        SpringApplication.run(UrlParserApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       var starWarCategory =  categoryCreator.create("Star Wars", List.of("star war", "starwars", "starwar", "starwars", "r2d2"));
       categoryHashMap.put("Star Wars", starWarCategory);
       var basketball =  categoryCreator.create("Basketball", List.of("basketball", "nba", "ncaa", "lebron james", "john stokton", "anthony davis"));
        categoryHashMap.put("Basketball", basketball);

    }
}
