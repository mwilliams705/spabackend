package com.snafusoft.spabackend;

import com.snafusoft.spabackend.api.SpaApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableAsync;

@Slf4j
@EnableAsync
@EnableRetry
@SpringBootApplication
public class SpaBackendApplication {

	@Value("${spring.datasource.username}")
	private static String username;
	@Value("${spring.datasource.url}")
	private static String url;

	public static void main(String[] args) {
		log.info("mysql username: {}" ,username);
		log.info("mysql connection string: {}" ,url);
		var app = new SpringApplication(SpaBackendApplication.class);
		app.run(args);
	}

}
