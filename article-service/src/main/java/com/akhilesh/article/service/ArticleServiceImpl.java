package com.akhilesh.article.service;

import com.akhilesh.article.model.Article;
import com.akhilesh.article.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    ArticleRepository articleRepository;

    @Override
    public List<Article> selectArticles() {
        return articleRepository.getAllArticle();
    }

    @Override
    public Article selectArticleById(Integer articleId) {
        return articleRepository.getArticleById(articleId);
    }

    @Override
    public Integer removeArticle(Integer articleId) {
        return articleRepository.deleteArticle(articleId);
    }

    @Override
    public Integer updateArticle(Article article) {
        return articleRepository.updateArticle(article);
    }

    @Override
    public Integer createArticle(Article article) {
        return articleRepository.addArticle(article);
    }
}
