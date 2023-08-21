package com.projeto.springaula.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projeto.springaula.entities.User;
import com.projeto.springaula.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "João gama", "joaogama@gmail.com", "988884444", "123456");
		User u2 = new User(null, "Pedro gama", "pedrogama@gmail.com", "977774444", "123456");
	
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
