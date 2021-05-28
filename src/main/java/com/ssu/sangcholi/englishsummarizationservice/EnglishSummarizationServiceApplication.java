package com.ssu.sangcholi.englishsummarizationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSidecar
public class EnglishSummarizationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnglishSummarizationServiceApplication.class, args);
    }

}
