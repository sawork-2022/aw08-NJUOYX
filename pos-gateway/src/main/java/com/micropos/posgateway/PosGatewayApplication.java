package com.micropos.posgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.channel.DirectChannel;

@SpringBootApplication
@EnableEurekaClient
public class PosGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PosGatewayApplication.class, args);
    }


}
