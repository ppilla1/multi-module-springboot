package net.bobokishu.deployer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"net.bobokishu.parentmodule",
		"net.bobokishu.module01",
		"net.bobokishu.module02"
})
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
