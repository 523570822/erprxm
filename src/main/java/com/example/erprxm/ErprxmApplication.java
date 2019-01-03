package com.example.erprxm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;


@ComponentScan(basePackages = {"com.winter"})
@SpringBootApplication
@MapperScan("com.winter.dao")

public class ErprxmApplication {
	public static void main(String[] args) {
		SpringApplication.run(ErprxmApplication.class, args);
	}

}

