package com.reeneev.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.reeneev.security.model.Role;
import com.reeneev.security.model.User;
import com.reeneev.security.repository.RoleRepository;
import com.reeneev.security.repository.UserRepository;

@SpringBootApplication
public class SpringSecurityApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

	@Override
	public void run(String... args) {
		roleRepository.save(new Role("ADMIN"));
		roleRepository.save(new Role("USER"));
		// roleRepository.save(new Role("Z"));

		List<Role> roles = new ArrayList<Role>();
		roles.add(roleRepository.getRoleByName("ADMIN"));
		roles.add(roleRepository.getRoleByName("USER"));
		// roles.add(roleRepository.getRoleByName("Z"));

		userRepository.save(new User("rahul", "rahul", roles));
	}
}
