package com.springtraining.recipemvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class RecipeMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeMvcApplication.class, args);
	}
}
