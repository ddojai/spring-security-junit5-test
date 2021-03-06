package com.sp.sec.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"com.sp.sec.user",
		"com.sp.sec.web"
})
public class UserAuthorityTestWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserAuthorityTestWebApplication.class, args);
	}

}
