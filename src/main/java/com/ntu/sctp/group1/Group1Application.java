package com.ntu.sctp.group1;

import com.ntu.sctp.group1.repository.*;
import jakarta.annotation.PostConstruct;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class Group1Application {

	@Autowired
	VolunteerRepository volunteerRepo;

	@Autowired
	ProfileRepository profileRepo;

	@Autowired
	ProgramRepository programRepo;

	@Autowired
	EnrolmentRepository enrolmentRepository;



	@Autowired
	UserRepository userRepo;



	public static void main(String[] args) {
		SpringApplication.run(Group1Application.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(@NonNull CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:3000");
			}
		};
	}


	@PostConstruct
	public void seeder () {}

}
