package com.hg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class FeignApplication {

    private final static Logger logger = LoggerFactory.getLogger(FeignApplication.class);

    public static void main(String[] args) {
        Environment env = SpringApplication.run(FeignApplication.class, args).getEnvironment();
        logger.info(
                "\n---------------------------------------------------------\n\t"
                    +"Application '{}' is running ! Arrces URLs:\n\t"
                    +"Local:\t\thttp://localhost:{}{}"
                    +"\n-----------------------------------------------------",
                env.getProperty("spring.application.name"),env.getProperty("server.port"),
                env.getProperty("server.servlet.context.path") != null ? env.getProperty("server.servlet.context-path") : ""
        );
    }

}
