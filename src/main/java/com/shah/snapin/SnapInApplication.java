package com.shah.snapin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class SnapInApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnapInApplication.class, args);
    }

}
