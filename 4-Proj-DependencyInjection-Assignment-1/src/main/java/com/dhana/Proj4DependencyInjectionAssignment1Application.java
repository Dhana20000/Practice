package com.dhana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.dhana.sbeans.Flipkart;

@SpringBootApplication
@ImportResource("com/dhana/cnfig/ApplicationConfig.xml")
public class Proj4DependencyInjectionAssignment1Application {

	public static void main(String[] args) {
	  ApplicationContext ctx =	SpringApplication.run(Proj4DependencyInjectionAssignment1Application.class, args);
	  Flipkart finder = ctx.getBean("flipkart",Flipkart.class);
	  finder.Cservice();
	  ((ConfigurableApplicationContext) ctx).close();
	}

}
