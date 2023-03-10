//package com.BeStore.code.Securiry;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@EnableWebSecurity
//@Configuration
//public class SecurityConfig  {
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//		http	
//				.authorizeHttpRequests((request)->request
//							.requestMatchers("/sanpham","/taikhoan").permitAll()
//							.anyRequest().authenticated()
//						)
//				.formLogin((form) -> form
//						.loginPage("/login")
//						.permitAll()
//					)
//				.logout((logout)->logout.permitAll());
//		return http.build();
//		
//	}
//	@Bean
//	public UserDetailsService userDetailsService() {
//		UserDetails user=User.withDefaultPasswordEncoder()
//									.username("loda")
//									.password("loda")
//									.roles("USER")
//									.build();
//		return new InMemoryUserDetailsManager(user);
//	}
//}
