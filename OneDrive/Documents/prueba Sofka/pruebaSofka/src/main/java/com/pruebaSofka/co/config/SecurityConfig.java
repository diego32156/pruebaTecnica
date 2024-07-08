package com.pruebaSofka.co.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {
	
	 @Bean
	    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
	        http
	            .csrf().disable()
	            .authorizeExchange()
	                .pathMatchers("/login", "/logout").permitAll()
	                .anyExchange().authenticated()
	                .and()
	            .formLogin()
	                .loginPage("/login")
	                .and()
	            .logout()   
	                .logoutUrl("/logout")
	                .logoutUrl("/login");

	        return http.build();
	    }

	    @Bean
	    public MapReactiveUserDetailsService userDetailsService() {
	        UserDetails user = User.withDefaultPasswordEncoder()
	                .username("user")
	                .password("password")
	                .roles("USER")
	                .build();
	        
	        return new MapReactiveUserDetailsService(user);
	    }
	
	
}
