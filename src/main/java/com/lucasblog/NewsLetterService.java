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

    public void insertNewsLetter(
            NewsLetter newsLetter) {
        newsLetterRepository.save(newsLetter);

        //Validations could be here.
    }


    public NewsLetter getAllNewsLetterByID(
            Integer id) {
        return newsLetterRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(
                        id + "not found"));
    }

    public NewsLetter deleteNewsLetterByID(Integer id) {
        NewsLetter newsLetter = newsLetterRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(id + " not found"));

        newsLetterRepository.deleteById(id);
        return newsLetter;
    }


    public NewsLetter updateNewsLetterByID(Integer id, NewsLetter update) {
        NewsLetter existing = newsLetterRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(id + " not found"));

        existing.setEmail(update.getEmail());
        existing.setFirstName(update.getFirstName());
        existing.setLastName(update.getLastName());

        return newsLetterRepository.save(existing);
    }

}
