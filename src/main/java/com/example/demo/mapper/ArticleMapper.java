package com.example.demo.mapper;

import com.example.demo.domain.Article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {
    public Article selectArticle(Integer id);
    public int updateArticle(Article article);
}
