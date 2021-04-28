
  package com.Casestudy.aZuulApi;
  
  
  
  import org.springframework.beans.factory.annotation.Autowired;
  
  import
  org.springframework.boot.context.properties.EnableConfigurationProperties;
  import org.springframework.context.annotation.Bean; import
  org.springframework.context.annotation.Configuration; import
  org.springframework.http.HttpMethod; import
  org.springframework.security.config.annotation.authentication.builders.
  AuthenticationManagerBuilder; import
  org.springframework.security.config.annotation.web.builders.HttpSecurity;
  import org.springframework.security.config.annotation.web.configuration.
  EnableWebSecurity; import
  org.springframework.security.config.annotation.web.configuration.
  WebSecurityConfigurerAdapter; import
  org.springframework.security.core.userdetails.UserDetails; import
  org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
  org.springframework.security.crypto.password.NoOpPasswordEncoder; import
  org.springframework.security.crypto.password.PasswordEncoder;
  
  
  @Configuration
  @EnableWebSecurity public class springsecurityconfig extends
  WebSecurityConfigurerAdapter {
  
  @Autowired userDetails userDetailsService;
  
  
  @Override protected void configure(AuthenticationManagerBuilder auth)throws
  Exception { auth.userDetailsService(userDetailsService);
  
  }
  
  @Override protected void configure(HttpSecurity http) throws Exception {

	  http.csrf().disable().
	   
	   authorizeRequests() .antMatchers(HttpMethod.GET,"/controller/admin/validate").hasAnyRole("ADMIN")
	   .antMatchers("/controller/pas/signin").hasAnyRole("USER") .anyRequest().permitAll()
	   .and().httpBasic();
	   
	  
  }
  
  @Bean public PasswordEncoder passwordEncoder() { return
  NoOpPasswordEncoder.getInstance(); }
  
  
  }
 