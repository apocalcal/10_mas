package com.ohgiraffers.secondserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Chap02SecondServerLectureSourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Chap02SecondServerLectureSourceApplication.class, args);
	}

}
