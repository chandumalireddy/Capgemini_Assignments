package com.casestudy.user;


import java.util.Arrays;

//http://localhost:8082/swagger-ui.html
import org.springframework.context.annotation.Bean;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.BasicAuth;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.service.SecurityScheme;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
	

	@Bean
	public Docket api() {

	    return new Docket(DocumentationType.SWAGGER_2)
	            .select()
	            .apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
	            .paths(PathSelectors.any())
	            .build()
	            .apiInfo(apiInfo())
	            .securitySchemes(Arrays.asList(securityScheme()))
	            .securityContexts(Arrays.asList(securityContexts()));
	}

	private ApiInfo apiInfo() {

	    return new ApiInfoBuilder()
	            .title("My API")
	            .description("My API Documentation")
	            .build();
	}

	private SecurityContext securityContexts() {
	    return SecurityContext.builder()
	            .securityReferences(Arrays.asList(basicAuthReference()))
	            .forPaths(PathSelectors.any())
	            .build();
	}

	private SecurityScheme securityScheme() {
	    return new BasicAuth("basicAuth");
	}

	private SecurityReference basicAuthReference() {
	    return new SecurityReference("basicAuth", new AuthorizationScope[0]);
	}

	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// enabling swagger-ui part for visual documentation
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}
}