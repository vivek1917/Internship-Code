package com.example.springboot;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext app_ctx)
	{
		return args -> 
		{
//			System.out.println("Let's inspect the beans provided by Spring Boot:");
			System.out.println("Some programming languages:");
			
//			String[] beanNames = app_ctx.getBeanDefinitionNames();
			String[] langs = {"Java","Kotlin","Python","C++","C","Ruby"};
			Arrays.sort(langs);
			for(String lang : langs)
			{
				System.out.println(lang);
			}
		};
	}
	
}