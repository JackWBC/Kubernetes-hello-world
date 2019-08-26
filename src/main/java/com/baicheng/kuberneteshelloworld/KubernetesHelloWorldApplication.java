package com.baicheng.kuberneteshelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class KubernetesHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubernetesHelloWorldApplication.class, args);
	}

}
