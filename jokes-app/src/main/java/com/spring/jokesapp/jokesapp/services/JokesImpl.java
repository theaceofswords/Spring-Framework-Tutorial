package com.spring.jokesapp.jokesapp.services;

import com.spring.jokesapp.jokesapp.model.JirenJokes;
import org.springframework.stereotype.Service;

@Service
public class JokesImpl implements Jokes {
    private final JirenJokes jirenJokes;

    public JokesImpl() {
        this.jirenJokes = new JirenJokes();
    }

    @Override
    public String getJoke() {
        return jirenJokes.getRandomQuote();
    }
}
