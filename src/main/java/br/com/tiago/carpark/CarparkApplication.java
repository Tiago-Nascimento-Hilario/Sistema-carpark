package br.com.tiago.carpark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarparkApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarparkApplication.class, args);

		
		System.out.println("Conectado");
	}

}
