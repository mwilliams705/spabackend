package com.snafusoft.spabackend;

import com.snafusoft.spabackend.api.SpaApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@EnableRetry
@SpringBootApplication
public class SpaBackendApplication {

	public static void main(String[] args) {
		var app = new SpringApplication(SpaBackendApplication.class);
		app.run(args);
	}

}
