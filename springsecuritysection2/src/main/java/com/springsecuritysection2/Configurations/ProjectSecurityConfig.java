package com.springsecuritysection2.Configurations;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
public class ProjectSecurityConfig {
	
	@SuppressWarnings("removal")
	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests().anyRequest().permitAll()
		.and().formLogin()
		.and().httpBasic();
		return http.build();
	}
	
//	Configuration to deny all the requests
	
//	@SuppressWarnings("removal")
//	@Bean
//	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//		http.authorizeHttpRequests().anyRequest().denyAll()
//		.and().formLogin()
//		.and().httpBasic();
//		return http.build();
//	}
	
//	Custom security configurations
	
//	@SuppressWarnings("removal")
//	@Bean
//	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//		http.authorizeHttpRequests()  
//		.requestMatchers("/myAccount","/myBalance","/myLoans","/myCards").authenticated()
//		.requestMatchers("/notices","/contact").permitAll()
//		.and().formLogin()
//		.and().httpBasic();
//		return http.build();
//	}
}
