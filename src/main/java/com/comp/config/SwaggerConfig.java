package com.comp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {                                    
	 @Bean
	    public Docket api(){
	        return new Docket(DocumentationType.SWAGGER_2)
	            .select()
	            .apis(RequestHandlerSelectors.any())
	            .paths(PathSelectors.regex("/api/.*"))
	            .build()
	            .apiInfo(apiInfo())
	            .enable(true);
	    }

	    private ApiInfo apiInfo() {
	        ApiInfo apiInfo = new ApiInfo(
	            "LTE stats collector",
	            "Auto generated documentation of rest services",
	            "API TOS",
	            "ashish.chaudhari@aa.com",
	            "AA API License",
	            "AA API License URL",""
	        );
	        return apiInfo;
	    }    
}