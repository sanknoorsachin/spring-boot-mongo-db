package com.example.app.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.app.mongo.document.Users;

@Repository
public interface UsersRepository extends MongoRepository<Users, Integer>{

}
