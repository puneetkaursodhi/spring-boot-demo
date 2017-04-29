package com.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.example")
class SpringBootDemoApplication {

	static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootDemoApplication.class, args);
		        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String name : beanNames) {
            System.out.println(name);
        }
	}
}
