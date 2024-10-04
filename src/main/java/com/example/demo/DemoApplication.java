package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	// the controller handles incoming HTTP requests and maps them
	//to different methods it's where the API endpoints are defined
	// handles the interaction between frontend(client) and your service logic
	//service contains the business logic of the application.
	//this acts like a bridge between the controller and the data repo
	// they are annotated with @Service

	//data repository
	// this interacts with the database to perform CRUD operations like
	//create read,update,delete data
	//model/entity
	//this represents the data model or business model(similar to models in
	//python
	//annotated with @ entity
}
