package com.lucasblog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//    Everthing that accespt request shold be called Controller
//    API File

@RestController

@RequestMapping("api/v1/news-letters")

public class NewsLetterController {


    @GetMapping

    public List<NewsLetter> getNewsLetters() {
        return List.of(
                new NewsLetter(
                        1,
                        "Lucas",
                        "Estefano",
                        "lucccases@lucas.com"

                ),
                new NewsLetter(
                        2,
                        "Laiz",
                        "Fernandes",
                        "laiz@laiz.com"
                )
        );
    }


}
