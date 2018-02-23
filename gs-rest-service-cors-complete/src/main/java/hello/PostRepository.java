package hello;

import org.springframework.data.repository.CrudRepository;
import hello.Post;


public interface PostRepository extends CrudRepository<Post, Long> {
	
}