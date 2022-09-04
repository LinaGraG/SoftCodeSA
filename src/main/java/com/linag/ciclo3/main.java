package com.linag.ciclo3;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@SpringBootApplication ( exclude = {SecurityAutoConfiguration.class})
@RestController
public class main {
    @GetMapping("/enterprises")
    public String enterprises(){
        return "Este es Sprint 3..haber si sale algo";
    }


    public static void  main(String[] args){
        SpringApplication.run(main.class, args);

    }

}
