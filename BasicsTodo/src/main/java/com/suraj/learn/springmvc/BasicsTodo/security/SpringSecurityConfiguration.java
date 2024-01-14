package com.suraj.learn.springmvc.BasicsTodo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
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
		 * this is depricated method but just used for demo
		 */
		UserDetails userDetails = User.withDefaultPasswordEncoder()
				.username("surya").password("dummy").roles("USER", "ADMIN")
				.build();
		
		return new InMemoryUserDetailsManager(userDetails);
	}
	
}
