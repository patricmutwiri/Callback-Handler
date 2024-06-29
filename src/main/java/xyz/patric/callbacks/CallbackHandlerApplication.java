/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri <dev@patric.xyz> on 6/29/24, 7:50 PM
 *
 */

package xyz.patric.callbacks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CallbackHandlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallbackHandlerApplication.class, args);
	}

}
