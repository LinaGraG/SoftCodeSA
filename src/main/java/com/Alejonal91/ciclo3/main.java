package com.Alejonal91.ciclo3;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication ( exclude = {SecurityAutoConfiguration.class})
@RestController
public class main {
    @GetMapping("/hello")
    public String hello(){
        return "Este es Sprint 3..haber si sale algo";
    }


    public static void  main(String[] args){
        SpringApplication.run(main.class, args);

    }

}
