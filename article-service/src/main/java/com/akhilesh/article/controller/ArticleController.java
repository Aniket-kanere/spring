package com.akhilesh.article.controller;

import com.akhilesh.article.model.Article;
import com.akhilesh.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @GetMapping("articles")
    ResponseEntity<List<Article>> getAllArticles() {
        List<Article> articleList = articleService.selectArticles();
        return new ResponseEntity<List<Article>>(articleList, HttpStatus.OK);
    }


    @GetMapping("article/{articleId}")
    ResponseEntity<Article> getArticleById(@PathVariable("articleId") Integer articleId) {
        Article article = articleService.selectArticleById(articleId);
        return new ResponseEntity<>(article, HttpStatus.OK);
    }


    @PutMapping("article")
    ResponseEntity<String> updateArticle(@RequestBody Article article) {
        articleService.updateArticle(article);
        return new ResponseEntity<>("Article Updated", HttpStatus.OK);

    }

    @DeleteMapping("article/{articleId}")
    ResponseEntity<String> deleteArticle(@PathVariable("articleId") Integer articleId) {
        articleService.removeArticle(articleId);
        return new ResponseEntity<>("Article Removed Successfully", HttpStatus.NO_CONTENT);
    }

    @PostMapping("article")
    ResponseEntity<String> addArticle(@RequestBody Article article){
        articleService.createArticle(article);
        return  new ResponseEntity<>("Article added ..", HttpStatus.CREATED);
    }
}
