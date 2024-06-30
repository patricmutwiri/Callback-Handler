/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri <dev@patric.xyz> on 6/30/24, 10:24 AM
 *
 */

package xyz.patric.callbacks;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Slf4j
@SpringBootApplication
@EnableJpaRepositories
public class CallbackHandlerApplication implements CommandLineRunner {
	@Autowired
	Environment e;

	public static void main(String[] args) {
		SpringApplication.run(CallbackHandlerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Datasource URL: {}", e.getProperty("spring.datasource.url"));
		log.info("Datasource Username: {}", e.getProperty("spring.datasource.username"));
		log.info("Datasource Password: {}", e.getProperty("spring.datasource.password"));
	}
}
