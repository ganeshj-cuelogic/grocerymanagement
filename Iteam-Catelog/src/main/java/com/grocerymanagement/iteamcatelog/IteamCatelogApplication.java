package com.grocerymanagement.iteamcatelog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class IteamCatelogApplication {

	public static void main(String[] args) {
		SpringApplication.run(IteamCatelogApplication.class, args);
	}

}
