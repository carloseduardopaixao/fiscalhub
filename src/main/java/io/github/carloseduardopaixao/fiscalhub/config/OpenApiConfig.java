package io.github.carloseduardopaixao.fiscalhub.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("FiscalHub API")
                        .version("1.0.0")
                        .description("API para gerenciamento fiscal de empresas.")
                        .contact(new Contact()
                                .name("Carlos Eduardo Paixão")
                                .email("ps.carlosdev@gmail.com"))
                        .license(new License()
                                .name("MIT")));
    }
}