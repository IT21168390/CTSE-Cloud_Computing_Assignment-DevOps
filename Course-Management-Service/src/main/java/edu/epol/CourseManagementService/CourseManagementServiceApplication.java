package edu.epol.CourseManagementService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CourseManagementServiceApplication {

	public static void main(String[] args) {
		//io.github.cdimascio.dotenv.Dotenv dotenv = io.github.cdimascio.dotenv.Dotenv.load(); // May need to be removed if going to Dockerize / containerize
		//dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue())); // May need to be removed if going to Dockerize / containerize
		SpringApplication.run(CourseManagementServiceApplication.class, args);
	}

}
