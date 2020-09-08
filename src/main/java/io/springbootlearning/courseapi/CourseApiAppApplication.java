package io.springbootlearning.courseapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"io.spring.springbootstarter.courses","io.spring.springbootstarter.topic"})
@SpringBootApplication
public class CourseApiAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiAppApplication.class, args);
	}

}
