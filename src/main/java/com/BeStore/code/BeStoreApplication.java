package com.BeStore.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

@SpringBootApplication()
public class BeStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeStoreApplication.class, args);
	}

}
