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
		userRepository.save(new User("pierre", "martin", 20, "pierre.martin@email.com"));
		userRepository.save(new User("jean", "claude", 30, "jean.claude@email.com"));
		userRepository.save(new User("laura", "one", 10, "laura.one@email.com"));
		
}
}
