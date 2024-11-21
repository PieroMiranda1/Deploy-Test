package com.filmnoprofesional.platform.si729pc2u20181g752.shared;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    @Bean
    public OpenAPI filmOpenApi(){

        var openApi = new OpenAPI();
        openApi
                .info(new Info()
                        .title("Film Platform REST API.")
                        .description("This is an Spring Boot RESTful service for a film platform.")
                        .version("v1.0.0")
                        .license(new License().name("Apache 2.0")
                                .url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("Film Platform wiki documentation")
                        .url("https://https://github.com"));
        return openApi;

    };
}
