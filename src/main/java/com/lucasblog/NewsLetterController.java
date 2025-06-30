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



    //DELETE BY ID
    @DeleteMapping("{id}")
    public NewsLetter deleteNewsLetterByID(
            @PathVariable Integer id
    ) {
        return newsLetterService.deleteNewsLetterByID(id);
    }



    //UPDATE  BY ID
    @PutMapping("{id}")
    public NewsLetter updateNewsLettersById(
            @PathVariable Integer id,
            @RequestBody NewsLetter newsLetter
    ) {
        return newsLetterService.updateNewsLetterByID(id,newsLetter);
    }



    //POST
    @PostMapping
    public void addNewsLetter(
           @RequestBody NewsLetter newsLetter) {
        newsLetterService.insertNewsLetter(newsLetter);
    }


}
