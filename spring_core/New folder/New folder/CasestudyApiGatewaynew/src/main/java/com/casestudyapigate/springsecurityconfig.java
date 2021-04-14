/*
 * package com.casestudyapigate;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter;
 * 
 * import org.springframework.security.crypto.password.NoOpPasswordEncoder;
 * import org.springframework.security.crypto.password.PasswordEncoder;
 * 
 * 
 * 
 * @EnableWebSecurity public class springsecurityconfig extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Autowired UserDetails userDetailsService;
 * 
 * 
 * @Override protected void configure(AuthenticationManagerBuilder auth)throws
 * Exception { auth.userDetailsService(userDetailsService);
 * 
 * }
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception { http
 * .httpBasic() .and()
 * 
 * .authorizeRequests()
 * 
 * 
 * .antMatchers("/train/train/all").hasAnyRole("ADMIN")
 * .anyRequest().permitAll() .and() .csrf().disable() .formLogin() .and()
 * .logout() .permitAll(); }
 * 
 * @Bean public PasswordEncoder passwordEncoder() { return
 * NoOpPasswordEncoder.getInstance(); }
 * 
 * 
 * }
 */


package com.casestudyapigate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@EnableWebSecurity
@Service
public class springsecurityconfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth)throws Exception
	{
		auth.inMemoryAuthentication()
		.withUser("chandu")
		.password("chandu")
		.roles("ADMIN")
		.and()
		.withUser("sekhar")
		.password("abc")
		.roles("USER");
	}
	@Override 
	protected void configure(HttpSecurity http)throws Exception
	{
		http.authorizeRequests()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/User").hasAnyRole("ADMIN,USER")
		.antMatchers("/").permitAll()
		
	
		.and()
		.formLogin();
	}
	@Bean
	public PasswordEncoder getEncoder() {
		
		return NoOpPasswordEncoder.getInstance();
	}
	
}





