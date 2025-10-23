package com.senac.feignclienttestestest_main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignclienttestestestMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignclienttestestestMainApplication.class, args);
	}

}
