package com.example.demo.service;

import com.example.demo.bo.Article;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {

    public List<Article> getAll() {
        // Récupérer tous les articles
        List<Article> articles = new ArrayList<>();
        articles.add(new Article(1L, "Croissant"));
        articles.add(new Article(2L, "Pain au chocolat"));
        articles.add(new Article(3L, "Beurre salé"));
        articles.add(new Article(4L, "Beurre de Cacahuètes"));

        // Retourner les articles
        return articles;
    }
}
