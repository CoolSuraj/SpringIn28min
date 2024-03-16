package com.suraj.learn.springmvc.BasicsTodo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;


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
				.username("in28min1").password("pass1").roles("USER", "ADMIN")
				.build();
		
		UserDetails userDetails2 = createNewUser("surya", "dummy");
		UserDetails userDetails3 = createNewUser("in28min", "passw");
		
		UserDetails[] users = {userDetails,userDetails2,userDetails3};
		return new InMemoryUserDetailsManager(users);
	}

	private UserDetails createNewUser(String username, String password) {
		/**
		 * To not get issue due to passwordEncoder() we use below implementation using below one should not give problem
		 */
		UserDetails userDetails2 = User.builder().passwordEncoder(input->passwordEncoder().encode(input))
				.username(username).password(password).roles("USER", "ADMIN")
				.build();
		return userDetails2;
	}
	
	/**
	 * Let's use something which is not depricated
	 */
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		
		
		return new BCryptPasswordEncoder();
	}
	
// All URL are protected for Spring boot Security 
	// A login form is shown for All Requests
	//So for accessing h2 we need to disable csrf() and  enable frames
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
				auth -> auth.anyRequest().authenticated());
		http.formLogin(withDefaults());
		//when we override SecurityFilterChain we need to define entire chain again
		
		http.csrf().disable();
		http.headers().frameOptions().disable();
		return http.build();
	}
	
	
}
