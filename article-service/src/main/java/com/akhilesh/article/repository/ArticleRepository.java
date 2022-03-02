package com.akhilesh.article.repository;

import com.akhilesh.article.model.Article;

import java.util.List;

public interface ArticleRepository {

   Integer addArticle(Article article);
   Integer updateArticle(Article article);
   Integer deleteArticle(Integer articleId);
   List<Article> getAllArticle();
   Article getArticleById(Integer articleId);

}
