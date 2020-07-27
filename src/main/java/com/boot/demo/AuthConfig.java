package com.boot.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class AuthConfig extends GlobalAuthenticationConfigurerAdapter{
	
	@Override
	public void init(AuthenticationManagerBuilder builder) throws Exception {
		
		//passing {noop} so that spring security understands its a plain text password and use NoOpPasswordEncoder 
		builder.inMemoryAuthentication()
		.withUser("qa_user1").password("{noop}12345678").roles("CUSTOMER")
		.and()
		.withUser("csagent").password("{noop}12345678").roles("SUPPORT");
		
	}

}
