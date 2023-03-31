package com.example.app.mongo.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document
public class Users {
	@Id
	private Integer id;
	private String firstName;
	private String teamName;
	private  Long Salary;
	private String lastName;

}
