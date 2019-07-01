package com.sui.login_web;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sui")
public class LoginWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginWebApplication.class, args);
	}

}
