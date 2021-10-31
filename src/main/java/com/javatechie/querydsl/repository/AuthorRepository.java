package com.javatechie.querydsl.repository;

import com.javatechie.querydsl.dto.AuthorStatistic;
import com.javatechie.querydsl.entity.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends BaseRepository<Author,Integer> {


    public Optional<Author> findAuthorByEmail(String email);

    public List<AuthorStatistic> getAuthorStatistic();

    public List<Author> getAuthors();
}
