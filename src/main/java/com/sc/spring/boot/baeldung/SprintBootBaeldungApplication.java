package com.sc.spring.boot.baeldung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.sc.spring.boot.baeldung.persistence.repo") 
@EntityScan("com.sc.spring.boot.baeldung.persistence.model")
@SpringBootApplication
public class SprintBootBaeldungApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintBootBaeldungApplication.class, args);
	}

}
