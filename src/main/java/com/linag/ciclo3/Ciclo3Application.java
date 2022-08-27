package com.linag.ciclo3;

import com.linag.ciclo3.clases.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Ciclo3Application {

	@GetMapping("/hello")
	public String hello() {
		return "Sprint 2...Como Hijuemadres funciona esto";
	}

	@GetMapping("/test")
	public String test() {
		Empresa emp = new Empresa("Soft Code", "Calle luna Calle Sol", "666 999 12345", "800212132-3");
		emp.setNombreEmpresa("SoftCode S.A");
		return emp.getNombreEmpresa();
	}

	public static void main(String[] args) {
		SpringApplication.run(Ciclo3Application.class, args);
		System.out.println("Hola Mundo");
	}
}


