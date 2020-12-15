package com.mxz.mishop0098.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mxz.mishop0098")
public class MishopOrderWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MishopOrderWebApplication.class, args);
	}

}
