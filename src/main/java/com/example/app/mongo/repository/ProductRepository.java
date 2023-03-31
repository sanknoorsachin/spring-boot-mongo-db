package com.example.app.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.app.mongo.document.Product;

@Repository
public interface ProductRepository  extends MongoRepository<Product, Integer>{

}
