/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri <dev@patric.xyz> on 6/29/24, 9:59 PM
 *
 */

package xyz.patric.callbacks;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import static org.springframework.test.util.AssertionErrors.assertNotNull;

@SpringBootTest
class CallbackHandlerApplicationTests {

    @Autowired
    private Environment environment;

	@Test
	void contextLoads() {
		String name = environment.getProperty("spring.application.name");
		assertNotNull(name, "Application name has been fetched!");
	}
}
