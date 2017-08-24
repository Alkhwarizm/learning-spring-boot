package com.example.secondtry;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SecondTryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondTryApplication.class, args);
	}

	@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context) {
	    return args -> {
            System.out.println("Here are the beans: ");

            String[] beanNames = context.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
        };
    }
}
