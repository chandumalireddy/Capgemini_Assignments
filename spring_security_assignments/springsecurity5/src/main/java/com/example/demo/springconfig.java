package com.example.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@EnableWebSecurity
public class springconfig extends WebSecurityConfigurerAdapter{
	@Autowired
	DataSource datasource;
	@Override
	protected void configure(AuthenticationManagerBuilder auth)throws Exception
	{
	auth.jdbcAuthentication()
/*.dataSource(datasource)
.withDefaultSchema()
.withUser(User.withUsername("chandu")
		.password("chandu")
		.roles("USER"))
.withUser(
		User.withUsername("admin")
		.password("pass")
		.roles("ADMIN")); */ /* this is default schema now we will do already existing data
	*/
	.dataSource(datasource);
	
	}
	@Override 
	protected void configure(HttpSecurity http)throws Exception
	{
		http.authorizeRequests()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/user").hasAnyRole("ADMIN,USER")
		.antMatchers("/").permitAll()
		.and()
		.formLogin()
		.and()  
	      .rememberMe()  
	      .key("rem-me-key")  
	      .rememberMeParameter("remember")
	      .rememberMeCookieName("rememberlogin") 
	      .tokenValiditySeconds(100);
	       
	}
@Bean
public PasswordEncoder getpassword() {
	return NoOpPasswordEncoder.getInstance();
	
}
}
