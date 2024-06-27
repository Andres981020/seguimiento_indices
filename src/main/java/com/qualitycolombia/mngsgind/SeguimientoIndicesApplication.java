package com.qualitycolombia.mngsgind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SeguimientoIndicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeguimientoIndicesApplication.class, args);
	}

}
