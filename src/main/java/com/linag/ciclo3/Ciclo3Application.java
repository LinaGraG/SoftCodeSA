package com.linag.ciclo3;

import com.linag.ciclo3.modelos.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@SpringBootApplication( exclude ={SecurityAutoConfiguration.class} )
public class Ciclo3Application {
	@GetMapping ("/hello")
	public String hello(){
		return "Ciclo 3..Ojala esto se pueda!!!";
	}
	@GetMapping ("/test")
	public String test(){
//		instanciar empresa
		Empresa emp = new Empresa( "Soft Code S.A.", "Calle arriba y calle abajo", "32166666","11199999");
// Cambiar nombre
	emp.setNombre("SoftCode S.A");
//	crear nombre
		System.out.println("Se Creo la empresa y se renombro");
		return emp.getNombre();
	}

	public static void main(String[] args) {
		SpringApplication.run(Ciclo3Application.class, args);
	}

}
