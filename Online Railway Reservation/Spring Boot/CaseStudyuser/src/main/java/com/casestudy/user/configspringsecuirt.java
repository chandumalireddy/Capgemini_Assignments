/*
 * package com.casestudy.user;
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * 
 * import
 * org.springframework.boot.context.properties.EnableConfigurationProperties;
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.http.HttpMethod; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
 * org.springframework.security.crypto.password.NoOpPasswordEncoder; import
 * org.springframework.security.crypto.password.PasswordEncoder;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class configspringsecuirt extends
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
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * 
 * 
 * 
 * 
 * http .httpBasic() .and()
 * 
 * .authorizeRequests()
 * 
 * 
 * .antMatchers("/admin/**").hasAnyRole("ADMIN")
 * .antMatchers("/user/bookTicket").hasAnyRole("USER")
 * .antMatchers("/user/Login").hasAnyRole("USER") .anyRequest().permitAll()
 * .and() .csrf().disable() .formLogin() .and() .logout() .permitAll();
 * 
 * 
 * 
 * 
 * http.cors(); http.csrf().disable().
 * 
 * authorizeRequests() .antMatchers("/admin/validate").hasAnyRole("ADMIN")
 * .antMatchers("/admin/post").hasAnyRole("ADMIN")
 * .antMatchers("/user/bookTicket").hasAnyRole("USER")
 * .antMatchers("/user/Login").hasAnyRole("USER") .anyRequest().permitAll()
 * .and().httpBasic();
 * 
 * }
 * 
 * @Bean public PasswordEncoder passwordEncoder() { return
 * NoOpPasswordEncoder.getInstance(); }
 * 
 * 
 * }
 */