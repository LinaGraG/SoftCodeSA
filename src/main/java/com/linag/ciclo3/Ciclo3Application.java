package com.linag.ciclo3;

import com.linag.ciclo3.clases.Empresa;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ciclo3Application {

	public static String main(String[] args) {
		Empresa emp = new Empresa("SOLAR SAS", "Calle la geta", "3213213211","800212132-3");
		emp.setNombreEmpresa("SOLAR LTDA");
		return emp.getNombreEmpresa();
	}
	}

}
