/*
 * package com.Casestudy.apigateway;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.stereotype.Component;
 * 
 * 
 * @Component public class userDetails implements UserDetailsService{
 * 
 * @Autowired private userRepo userRepository;
 * 
 * @Override public org.springframework.security.core.userdetails.UserDetails
 * loadUserByUsername(String username) throws UsernameNotFoundException { user
 * user = userRepository.findByUsername(username);
 * 
 * if (user == null) { throw new
 * UsernameNotFoundException("Could not find user"); }
 * 
 * return new MyUserDetails(user); }
 * 
 * }
 */