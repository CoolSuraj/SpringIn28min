package com.suraj.learn.springmvc.BasicsTodo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfiguration {
	
	/**
	 * If we need to use security configuration we need to use either LDAP or Database
	 * For now we use In Memory DB 
	 */
		
	@Bean
	InMemoryUserDetailsManager CreateUserDetailsManager() {
		/**
		 * this (withDefaultPasswordEncoder()) is depricated method but just used for demo but when we use passwordEncoder() then we might get issue
		 */
		UserDetails userDetails = User.withDefaultPasswordEncoder()
				.username("surya").password("dummy").roles("USER", "ADMIN")
				.build();
		/**
		 * hence to not get issue due to passwordEncoder() we use below implementation using below one should not give problem
		 */
		UserDetails userDetails2 = User.builder().passwordEncoder(input->passwordEncoder().encode(input))
				.username("user").password("pass1").roles("USER", "ADMIN")
				.build();
		
		UserDetails[] users = {userDetails,userDetails2};
		return new InMemoryUserDetailsManager(users);
	}
	
	/**
	 * Let's use something which is not depricated
	 */
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		
		
		return new BCryptPasswordEncoder();
	}
	
}
