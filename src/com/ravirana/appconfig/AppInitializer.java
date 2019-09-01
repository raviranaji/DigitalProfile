package com.ravirana.appconfig;

import javax.servlet.ServletContext;

import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.ravirana.common.AppContextListerner;
import com.ravirana.common.AppSessionListerner;

public class AppInitializer implements WebApplicationInitializer{ //AbstractAnnotationConfigDispatcherServletInitializer annother class for configuration
	 @Override
	    public void onStartup(ServletContext container)
	    {
		  //https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html
		 //http://docs.spring.io/spring/docs/3.1.x/javadoc-api/org/springframework/web/WebApplicationInitializer.html

 
		    System.out.println("Application is started");
	        // Create the 'root' Spring application context
	        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
	        rootContext.setServletContext(container);
	        rootContext.register(AppConfiguration.class);
	 
	        // Manage the lifecycle of the root application context
	        container.addListener(new ContextLoaderListener(rootContext));
	        container.addListener(new AppSessionListerner());
	        container.addListener(new AppContextListerner());
	 
	        // Create the dispatcher servlet's Spring application context
	        AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
	        //dispatcherContext.register(DispatcherConfig.class);
	 
	        // Create and register the DispatcherServlet
	        DispatcherServlet dispatcherServlet = new DispatcherServlet(rootContext);
	        ServletRegistration.Dynamic dispatcher = container.addServlet("DispatcherServlet",
	        		dispatcherServlet);
	        dispatcher.setLoadOnStartup(1);
	        dispatcher.addMapping("/");
	    }
}
