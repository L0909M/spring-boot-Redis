package com.example.demo;

import com.example.demo.domain.Article;
import com.example.demo.domain.Comment;
import com.example.demo.mapper.ArticleMapper;
import com.example.demo.mapper.CommentMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

    //使用注解方式整合MyBatis
   /*
    @Autowired
    private CommentMapper commentMapper;
    @Test
    public void selectComment(){
        Comment comment = commentMapper.findById(1);
        System.out.println(comment);
    }*/

    //使用配置文件方式整合 MyBatis

    @Autowired
    private ArticleMapper articleMapper;
    @Test
    public void selectArticle(){
        Article article = articleMapper.selectArticle(1);
        System.out.println(article);
    }

}
