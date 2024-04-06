package com.project.soyoucryptoback;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")

                .allowedOrigins("https://soyoucryptoweb.shop", "http://soyoucryptoweb.shop"
                        )
                .allowedMethods("GET","POST","PUT","DELETE","PATCH")
                .allowCredentials(true)
                .maxAge(3000);
    }
}
