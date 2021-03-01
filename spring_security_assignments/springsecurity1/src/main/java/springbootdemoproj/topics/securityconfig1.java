package springbootdemoproj.topics;




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
public class securityconfig1 extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth)throws Exception
	{
		auth.inMemoryAuthentication()
		.withUser("chandu")
		.password("chandu")
		.roles("manager")
		.and()
		.withUser("sekhar")
		.password("abc")
		.roles("CEO");
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
