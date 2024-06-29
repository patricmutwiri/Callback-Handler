/*
 * Copyright (c) 2024.
 * @author Patrick Mutwiri <dev@patric.xyz> on 6/29/24, 2:28 PM
 *
 */

package xyz.patric.callbacks.config;


import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Callback Handler Service APIs")
                        .description("The callback handler y'all been missing. ")
                        .version("v1.0")
                        .contact(new Contact()
                                .name("Patrick Mutwiri")
                                .url("https://patric.xyz")
                                .email("dev@patric.xyz"))
                        .license(new License().name("GPL 3.0").url("https://github.com/patricmutwiri/Callback-Handler?tab=GPL-3.0-1-ov-file")))
                .externalDocs(new ExternalDocumentation()
                        .description("Project Documentation")
                        .url("https://github.com/patricmutwiri/Callback-Handler"));
    }

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("public")
                .pathsToMatch("/api/**")
                .build();
    }
}