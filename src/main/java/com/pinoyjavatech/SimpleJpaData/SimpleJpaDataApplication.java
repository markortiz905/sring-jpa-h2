package com.pinoyjavatech.SimpleJpaData;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

import org.apache.catalina.core.ApplicationContext;
import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
public class SimpleJpaDataApplication {
	
	@Bean
    ServletRegistrationBean h2servletRegistration(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());
        registrationBean.addUrlMappings("/console/*");
        return registrationBean;
    }

	public static void main(String[] args) {
		SpringApplication.run(SimpleJpaDataApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner executeQuery(PersonRepository personRepo) {
		return (args) -> {
			Person newPerson = new Person("Chel", "Pasig");
			personRepo.save(newPerson);
			
			List<Person> person = personRepo.getAllPersons();
			System.out.println(person.size());//2 
			person.stream().forEach( p -> {
				System.out.println(p);
			});
		};
	}

}
