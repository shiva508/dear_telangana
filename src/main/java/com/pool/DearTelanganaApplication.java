package com.pool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DearTelanganaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DearTelanganaApplication.class, args);
		//Arrays.stream(configurableApplicationContext.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
