package com.akhilesh.article.repository;

import com.akhilesh.article.model.Article;
import com.akhilesh.article.model.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArticleRepositoryImpl implements ArticleRepository{


    @Autowired
    JdbcTemplate jdbcTemplate;

    final String SELECT_ARTICLE = "SELECT * FROM Article";
    final String SELECT_ARTICLE_BY_ID = "SELECT * FROM Article WHERE ArticleId = ?";
    final String DELETE_ARTICLE_BY_ID = "DELETE FROM Article WHERE ArticleId = ?";
    final String ADD_ARTICLE = "INSERT INTO  Article  Values (?, ? , ?)";
    final String UPDATE_ARTICLE = "UPDATE  Article SET Title = ? , Category = ? Where ArticleId = ?";


    @Override
    public Integer addArticle(Article article) {
        return jdbcTemplate.update(ADD_ARTICLE, article.getArticleId(),article.getTitle(),article.getCategory());
    }

    @Override
    public Integer updateArticle(Article article) {
        return jdbcTemplate.update(UPDATE_ARTICLE,article.getTitle(), article.getCategory(), article.getArticleId());
    }

    @Override
    public Integer deleteArticle(Integer articleId) {
        return jdbcTemplate.update(DELETE_ARTICLE_BY_ID, articleId);
    }

    @Override
    public List<Article> getAllArticle() {
        return jdbcTemplate.query(SELECT_ARTICLE, new ArticleMapper());
    }

    @Override
    public Article getArticleById(Integer articleId) {
        return jdbcTemplate.queryForObject(SELECT_ARTICLE_BY_ID,  new ArticleMapper(), articleId);
    }
}
