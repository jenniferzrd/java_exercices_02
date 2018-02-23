package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// /post
import org.springframework.web.bind.annotation.GetMapping;
// /all --> /post/all
import org.springframework.web.bind.annotation.RequestParam;
// les controllers récup et gère (quand on a cliqué sur une page) les paramètres
import org.springframework.web.bind.annotation.ResponseBody;
// envoie la réponse au site qui a fait la requette
import org.springframework.web.bind.annotation.CrossOrigin;
// cela permet la communication entre front et back

import hello.Post;
import hello.PostRepository;

@Controller

@CrossOrigin (origins= "*")
@RequestMapping(path= "/posts")

public class PostController {
	@Autowired
	// genere auto les méthodes CRUD sur post
	private PostRepository postRepository;
	
	@GetMapping(path="/add")
	public @ResponseBody String addNewPost (@RequestParam String title) {
		Post p = new Post();
		p.setTitle(title);
		postRepository.save(p);
		return "Success";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Post> getAllPosts() {
		return postRepository.findAll();
	}
	}