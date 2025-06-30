package com.lucasblog;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

//    Everthing that accespt request shold be called Controller
//    API File

@RestController

@RequestMapping("api/v1/news-letters")

public class NewsLetterController {


    private final NewsLetterService newsLetterService;

    public NewsLetterController(NewsLetterService newsLetterService) {
        this.newsLetterService = newsLetterService;
    }

    @GetMapping

    public List<NewsLetter> getNewsLetters() {
        return newsLetterService.getAllNewsLetters();
    }

    @PostMapping
    public void addNewsLetter(
           @RequestBody NewsLetter newsLetter) {
        newsLetterService.insertNewsLetter(newsLetter);
    }


}
