package com.lucasblog;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsLetterService {

    private final NewsLetterRepository newsLetterRepository;


    public NewsLetterService(NewsLetterRepository newsLetterRepository) {
        this.newsLetterRepository = newsLetterRepository;
    }

    public List<NewsLetter> getAllNewsLetters() {
        return newsLetterRepository.findAll();
    }
}
