package com.dingxianginc.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class SpringbootdubboApplication implements CommandLineRunner{

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(SpringbootdubboApplication.class, args);
		TimeUnit.MINUTES.sleep(10);
	}

	@Override
	public void run(String... strings) throws Exception {
		System.out.println("服务提供者启动完毕");
	}
}
