package org.bedu.java.backend.sesion4.sesion04;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Sesion04Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Sesion04Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner reader = new Scanner(System.in);

		System.out.println("Introduce el nombre: ");
		String nombre = reader.nextLine();

		System.out.println("Introduce el teléfono: ");
		String telefono = reader.nextLine();

		org.bedu.java.backend.sesion4.Model.Persona persona = new org.bedu.java.backend.sesion4.Model.Persona(nombre, telefono);

		System.out.println(persona);
	}

}
