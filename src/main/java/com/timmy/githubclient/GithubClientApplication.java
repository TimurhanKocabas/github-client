package com.timmy.githubclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(GithubProperties.class)
public class GithubClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubClientApplication.class, args);
	}

}
