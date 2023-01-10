package com.example.configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class SwaggerConfiguration {


//    @Bean
//    public GroupedOpenApi publicApi() {
//        return GroupedOpenApi.builder()
//                .group("v1-definition")
//                .pathsToMatch("/*")
//                .build();
//    }
    @Bean
    public OpenAPI springShopOpenAPI(@Value("${springdoc.version}") String springdocVersion) {
        return new OpenAPI()
                .components(new Components())
                .info(new Info().title("hh API")
                        .description("프로젝트 API 명세서입니다.")
                        .version(springdocVersion));
    }


}
