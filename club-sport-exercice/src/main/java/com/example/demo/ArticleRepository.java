package com.example.demo;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.Article;

public interface ArticleRepository extends CrudRepository<Article, Integer> {
	

}
