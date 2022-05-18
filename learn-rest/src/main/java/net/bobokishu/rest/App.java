package net.bobokishu.rest;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		log.info("Hello from learn-rest module....");
		SpringApplication.run(App.class, args);
	}

}
