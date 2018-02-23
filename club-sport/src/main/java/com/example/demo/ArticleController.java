package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.example.demo.Article;
import com.example.demo.ArticleRepository;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping(path="/article")

public class ArticleController {

	@Autowired

	private ArticleRepository articles;
	
	@PostMapping()

	public @ResponseBody Article addNewArticle (@RequestBody Map<String, Object>[] article) {
		Article a = new Article();
		String titre = article[0].get("titre").toString();
		String desc = article[0].get("desc").toString();
		String img = article[0].get("img").toString();
		
		a.setTitre(titre);
		a.setDesc(desc);
		a.setImg(img);
		
		articles.save(a);
		return a;
	}

	@GetMapping()

	public @ResponseBody Iterable<Article> getAllArticle() {
		return articles.findAll();
	}
	
	public Article getArticle(@PathVariable("id") Integer id) {
		return this.articles.findOne(id);
	}
	
}
