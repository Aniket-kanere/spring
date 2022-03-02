package com.akhilesh.article.model;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ArticleMapper implements RowMapper<Article> {
    @Override
    public Article mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Article article= new Article();
        article.setArticleId(resultSet.getInt("articleId"));
        article.setTitle(resultSet.getString("title"));
        article.setCategory(resultSet.getString("category"));

        return article;
    }
}
