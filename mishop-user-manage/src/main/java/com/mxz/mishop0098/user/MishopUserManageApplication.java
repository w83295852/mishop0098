package com.mxz.mishop0098.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.mxz.mishop0098.user.mapper")
public class MishopUserManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(MishopUserManageApplication.class, args);
	}

}
