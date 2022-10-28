package com.project.soyoucryptoback;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")

                .allowedOrigins("http://localhost:3000", "http://localhost:3001", "http://localhost:3002", "https://master--fascinating-faun-20ead4.netlify.app", "https://635b93bf10e85609b2e5f906--courageous-gelato-b43521.netlify.app")
                .allowedMethods("GET","POST","PUT","DELETE","PATCH")
                .allowCredentials(true)
                .maxAge(3000);
    }
}
