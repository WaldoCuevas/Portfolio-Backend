package com.portfolio.portfolioBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableWebMvc
@Configuration
public class PortfolioBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioBackendApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer getCorsConfiguration() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
				.allowedOrigins("https://waldocuevas-portfolio.web.app","https://portfolio-backend-u2ee.onrender.com")
				.allowedMethods("*")
				.allowedHeaders("*");
			}
		};
	}

}
