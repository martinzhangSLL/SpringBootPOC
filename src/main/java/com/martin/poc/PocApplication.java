package com.martin.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PocApplication {


    public static void main(String[] args) {
        SpringApplication.run(PocApplication.class, args);
    }

}
