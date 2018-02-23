package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Article;
import com.example.demo.ArticleRepository;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping(path="/article")

public class ArticleController {

	@Autowired
	private ArticleRepository articles;
	
	@PostMapping()
	public @ResponseBody Article addNewArticle (@RequestBody Map<String, Object>[] Article) {
		Article a = new Article();
		String titre = Article[0].get("titre").toString();
		String photo = Article[0].get("photo").toString();
				
		a.setTitre(titre);
		a.setPhoto(photo);
		
		articles.save(a);
		return a;
	}
	

	@GetMapping()
	
	public @ResponseBody Iterable<Article> getAllArticle() {
		return articles.findAll();
	}
	
	@GetMapping(path="/{id}")
	public Article getArticle(@PathVariable("id") Integer id) {
		return this.articles.findOne(id);
	}
	
}
