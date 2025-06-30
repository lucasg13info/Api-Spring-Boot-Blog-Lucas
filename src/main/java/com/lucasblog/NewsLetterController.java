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

    //GET
    @GetMapping
    public List<NewsLetter> getNewsLetters() {
        return newsLetterService.getAllNewsLetters();
    }

    //GET BY ID
    @GetMapping("{id}")
    public NewsLetter getNewsLettersById(
            @PathVariable Integer id
    ) {
        return newsLetterService.getAllNewsLetterByID(id);
    }

    //POST
    @PostMapping
    public void addNewsLetter(
           @RequestBody NewsLetter newsLetter) {
        newsLetterService.insertNewsLetter(newsLetter);
    }


}
