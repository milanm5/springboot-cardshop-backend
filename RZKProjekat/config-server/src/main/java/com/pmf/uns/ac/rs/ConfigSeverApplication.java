package com.pmf.uns.ac.rs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigSeverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigSeverApplication.class, args);
	}

}
