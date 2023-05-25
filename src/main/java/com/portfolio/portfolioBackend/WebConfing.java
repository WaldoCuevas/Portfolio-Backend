/*
package com.portfolio.portfolioBackend;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@EnableWebMvc
@Configuration
public class WebConfing implements WebMvcConfigurer {

    @Value("${allowed.origin}")
    private String allowedOrigin;
    
    @Bean
    public WebMvcConfigurer getCorsConfiguration (){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**"). 
                allowedOrigins(allowedOrigin)
                .allowedMethods("GET","POST","PUT","DELETE","OPTIONS")
                .allowedHeaders("*");
            }
        };
    }
    
}
*/