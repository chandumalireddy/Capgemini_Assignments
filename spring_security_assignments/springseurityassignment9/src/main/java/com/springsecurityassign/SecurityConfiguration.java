package com.springsecurityassign;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	/*
	 * @Autowired DataSource dataSource;
	 */
	/*
	 * // to create a service for further OPs with hard-coded user details
	 * 
	 * @Autowired UserDetailsService userDetailsService;
	 */
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		
		auth.inMemoryAuthentication().withUser("chandu")
		.password("chandu")
        .roles("USER")
        .and()
        .withUser("admin")
        .password("$2a$10$y.OcCvDVDWWDa9mHt0lOO.gs.eAZmdVFEdGX1EANmoOv2gBVteLCG")
        .roles("ADMIN");
		//auth.userDetailsService(userDetailsService);
	}

	
	// authorization
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		// setting the authorization for the roles USER and ADMIN 
		
		  http.authorizeRequests() .antMatchers("/admin").hasRole("ADMIN")
		  						   .antMatchers("/user").hasAnyRole("USER","ADMIN")
		  						   .antMatchers("/").permitAll()
		  						   .and()
		  						   .formLogin() .
		  						   and()
		  						 .rememberMe()  
		  					      .key("rem-me-key")  
		  					      .rememberMeParameter("remember")
		  					      .rememberMeCookieName("rememberlogin") 
		  					      .tokenValiditySeconds(100);
		 
	}
	
	
	


	@Bean
	public PasswordEncoder getEncoder() {
		
		return new BCryptPasswordEncoder();
	}
	
	
}