package com.spring.web.ServletExample;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServletExampleApplication {

	public static void main(String[] args) throws LifecycleException {
		SpringApplication.run(ServletExampleApplication.class, args);

		System.out.println("Hello");

		Tomcat tomcat = new Tomcat();
		tomcat.start();
		tomcat.getServer().await();
		

	}

}
