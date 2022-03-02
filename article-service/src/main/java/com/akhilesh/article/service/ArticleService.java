package com.akhilesh.article.service;

import com.akhilesh.article.model.Article;

import java.util.List;

public interface ArticleService {

    List<Article> selectArticles();
    Article selectArticleById(Integer articleId);
    Integer removeArticle(Integer articleId);
    Integer updateArticle(Article article);
    Integer createArticle(Article article);

}
