package com.SpringSecurity.JwtTokenDemo;

import com.SpringSecurity.JwtTokenDemo.entity.Role;
import com.SpringSecurity.JwtTokenDemo.entity.User;
import com.SpringSecurity.JwtTokenDemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class JwtTokenDemoApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(JwtTokenDemoApplication.class, args);
	}

	public void run(String... args){
		User adminAccount = userRepository.findByRole(Role.ADMIN);
		if(null == adminAccount){
			User  user = new User();
			user.setEmail("admin@gmail.com");
			user.setName("admin");
			user.setSurname("admin");
			user.setRole(Role.ADMIN);
			user.setPassword(new BCryptPasswordEncoder().encode("1234"));
			userRepository.save(user);
		}
	}
}
