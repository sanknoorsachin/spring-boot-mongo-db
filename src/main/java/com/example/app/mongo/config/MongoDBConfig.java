package com.example.app.mongo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.app.mongo.document.Users;
import com.example.app.mongo.repository.UsersRepository;

@EnableMongoRepositories(basePackageClasses =UsersRepository.class )
@Configuration
public class MongoDBConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(UsersRepository userRepository) {			
				return Strings->{
					userRepository.save(new Users(1,"sachin","Development",20000L,"Sanknoor"));
					userRepository.save(new Users(2,"Rohith","Devops",50000L,"Sanknoor"));
				};
				}
			}
