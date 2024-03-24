package ru.java.service.cicd_lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdLabApplication {

    public static void main(String[] args) {
        System.out.println("It is amazing");
        SpringApplication.run(CicdLabApplication.class, args);
    }

}
