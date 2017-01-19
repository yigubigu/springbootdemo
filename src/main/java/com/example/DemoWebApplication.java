package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;


public class DemoWebApplication extends SpringBootServletInitializer  {

	  @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    	logger.debug("=============config appplicaiton===========");
	        return application.sources(DemoWebApplication.class);
	    }

	    public static void main(String[] args) throws Exception {
	    	
	        SpringApplication.run(DemoWebApplication.class, args);
	    }

}
