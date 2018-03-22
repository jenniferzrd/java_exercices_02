package org.wishlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.wishlist.entities.User;
import org.wishlist.repositories.UserRepository;

@SpringBootApplication
public class SpringbootTutoTestApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootTutoTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("one", "one", 20));
		userRepository.save(new User("two", "one", 30));
		userRepository.save(new User("three", "one", 10));
		
}
}
