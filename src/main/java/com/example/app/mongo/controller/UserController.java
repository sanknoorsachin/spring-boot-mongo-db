package com.example.app.mongo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.mongo.document.Product;
import com.example.app.mongo.document.Users;
import com.example.app.mongo.repository.ProductRepository;
import com.example.app.mongo.repository.UsersRepository;

@RestController
@RequestMapping("/rest/users")
public class UserController {
	
	private UsersRepository userRepo;
	private ProductRepository prodRepo;
	
	
	
	public UserController(UsersRepository userRepo, ProductRepository prodRepo) {
		super();
		this.userRepo = userRepo;
		this.prodRepo=prodRepo;
	}

	@GetMapping("/all")
	public List<Users> getUsers(){	
		return userRepo.findAll();
		
	}
	
	@GetMapping("/{id}")
	public Users getUser(@PathVariable Integer id) {
		Optional<Users> user= userRepo.findById(id);
		
		Users u=null;
		if(!user.isEmpty()) {
			u=user.get();
		}
		
		return u;
	}

	@PostMapping("/product")
	public void insertProductRecord(@RequestBody Product productData) {
		prodRepo.save(productData);
	}
}
