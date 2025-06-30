package com.lucasblog;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsLetterRepository
        extends JpaRepository<NewsLetter,Integer> {
}
