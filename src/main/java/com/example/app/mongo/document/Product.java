package com.example.app.mongo.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "product")
public class Product {
	
	@Id
	private Integer productId;
	private String productName;
	private String qrCode;
	

}
