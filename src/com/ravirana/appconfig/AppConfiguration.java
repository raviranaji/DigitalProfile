package com.ravirana.appconfig;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "com.ravirana.common", "com.ravirana.appconfig", "com.ravirana.controller.portal" })
public class AppConfiguration implements WebMvcConfigurer {

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		// viewResolver.setViewClass(JstlView.class);
		System.out.println("inside viewResolver");
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
		// TODO Auto-generated method stub
		System.out.println("inside addArgumentResolvers");
		WebMvcConfigurer.super.addArgumentResolvers(resolvers);
	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// TODO Auto-generated method stub
		System.out.println("inside addCorsMappings");
		WebMvcConfigurer.super.addCorsMappings(registry);
	}

	@Override
	public void addFormatters(FormatterRegistry registry) {
		// TODO Auto-generated method stub
		System.out.println("inside addFormatters");
		WebMvcConfigurer.super.addFormatters(registry);
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		System.out.println("inside addInterceptors");
		WebMvcConfigurer.super.addInterceptors(registry);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// Register resource handler for images
		System.out.println("inside addResourceHandlers");
		registry.addResourceHandler("/public/**").addResourceLocations("/WEB-INF/public/");

	}

	@Override
	public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> handlers) {
		// TODO Auto-generated method stub
		System.out.println("inside addReturnValueHandlers");
		WebMvcConfigurer.super.addReturnValueHandlers(handlers);
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// TODO Auto-generated method stub
		// mapping '/' to index view name without a controller	
		System.out.println("inside addViewControllers");
		/*
		 * ViewControllerRegistration r = registry.addViewController("/");
		 * r.setViewName("portal");
		 */
		 
	}

	@Override
	public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
		// TODO Auto-generated method stub
		System.out.println("inside configureAsyncSupport");
		WebMvcConfigurer.super.configureAsyncSupport(configurer);
	}

	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		// TODO Auto-generated method stub
		System.out.println("inside configureContentNegotiation");
		WebMvcConfigurer.super.configureContentNegotiation(configurer);
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		// TODO Auto-generated method stub
		System.out.println("inside configureDefaultServletHandling");
		WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
	}

	@Override
	public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
		// TODO Auto-generated method stub
		System.out.println("inside configureHandlerExceptionResolvers");
		WebMvcConfigurer.super.configureHandlerExceptionResolvers(resolvers);
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		// TODO Auto-generated method stub
		System.out.println("inside configureMessageConverters");
		WebMvcConfigurer.super.configureMessageConverters(converters);
	}

	@Override
	public void configurePathMatch(PathMatchConfigurer configurer) {
		// TODO Auto-generated method stub
		System.out.println("inside configurePathMatch");
		WebMvcConfigurer.super.configurePathMatch(configurer);
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub
		System.out.println("inside configureViewResolvers");
		WebMvcConfigurer.super.configureViewResolvers(registry);
	}

	@Override
	public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
		// TODO Auto-generated method stub
		System.out.println("inside extendHandlerExceptionResolvers");
		WebMvcConfigurer.super.extendHandlerExceptionResolvers(resolvers);
	}

	@Override
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		// TODO Auto-generated method stub
		System.out.println("inside extendMessageConverters");
		WebMvcConfigurer.super.extendMessageConverters(converters);
	}

	@Override
	public MessageCodesResolver getMessageCodesResolver() {
		// TODO Auto-generated method stub
		System.out.println("inside getMessageCodesResolver");
		return WebMvcConfigurer.super.getMessageCodesResolver();
	}

	@Override
	public Validator getValidator() {
		// TODO Auto-generated method stub
		System.out.println("inside getValidator");
		return WebMvcConfigurer.super.getValidator();
	}

}
