package com.ivanribeiro.cardprod.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable() // Desativa a proteção CSRF, caso você esteja testando
            .authorizeRequests()
            .anyRequest().permitAll(); // Permite o acesso a todas as rotas sem autenticação
        
        return http.build();
    }
}