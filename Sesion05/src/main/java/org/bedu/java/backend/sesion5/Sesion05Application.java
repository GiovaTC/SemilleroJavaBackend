package org.bedu.java.backend.sesion5;

import org.bedu.java.backend.sesion5.Model.Persona;
import org.bedu.java.backend.sesion5.Service.FormateadorTelefono;
import org.bedu.java.backend.sesion5.Service.ValidadorTelefono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Sesion05Application {

	private static ValidadorTelefono validadorTelefono;
	private static FormateadorTelefono formateadorTelefono;

	public static void main(String[] args) {
		SpringApplication.run(Sesion05Application.class, args);
		Scanner reader = new Scanner(System.in);

		System.out.println("Introduce el nombre: ");
		String nombre = reader.nextLine();

		System.out.println("Introduce el teléfono: ");
		String telefono = reader.nextLine();

		if (validadorTelefono.isValido(telefono)) {
			telefono = validadorTelefono.limpiaNumero(telefono);
			telefono = formateadorTelefono.formatea(telefono);

			Persona persona = new Persona(nombre, telefono);

			System.out.println(persona);
		} else {
			System.out.println("Por favor, introduce un número válido");
		}
	}

	@Autowired
	public Sesion05Application(ValidadorTelefono validadorTelefono, FormateadorTelefono formateadorTelefono) {
		this.validadorTelefono = validadorTelefono;
		this.formateadorTelefono = formateadorTelefono;
	}
}
