package com.deep.river;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.deep")
public class DeepriverpageApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeepriverpageApplication.class, args);
	}

}
