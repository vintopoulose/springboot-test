package com.example.testboot.employee;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.testboot.employee.repository")
public class BootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootTestApplication.class, args);
	}
}
