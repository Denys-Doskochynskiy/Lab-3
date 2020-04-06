package ua.lviv.iot.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ " ua.lviv.iot.data", "ua.lviv.iot.business", "ua.lviv.iot.rest.RestAplication.controller" })
@EnableJpaRepositories({ "ua.lviv.iot.data" })
public class RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

}
