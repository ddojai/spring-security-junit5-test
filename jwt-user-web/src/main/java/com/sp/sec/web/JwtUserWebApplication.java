package com.sp.sec.web;

import com.sp.sec.web.config.SpJwtProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(scanBasePackages = {
		"com.sp.sec.user",
		"com.sp.sec.web"
})
@EnableConfigurationProperties({SpJwtProperties.class})
public class JwtUserWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtUserWebApplication.class, args);
	}

}