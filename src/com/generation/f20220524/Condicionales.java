package com.generation.f20220524;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		//capturar el ingreso por consola
		Scanner sc = new Scanner(System.in);
				
		// validar la mayoria de edad
		//establecer punto critico -> 18 años
		
		int mayoriaEdad = 18;
		
		//solicitar el ingreso de edad
		
		System.out.println("Ingrese su edad");
		int edad = sc.nextInt();//capturando el ingreso por consola y lo guardamos en una variable "edad"
		
		if (edad >= mayoriaEdad) {
			System.out.println("Usted es mayor de edad");
		}else {
			System.out.println("No esta permitido su ingreso");
		}
	}
}
		/* Solicitar todos los string
		 * nombre, apellido, direccion
		 * edad, numeroDireccion, 
		 * Saldo ($) 50000 minimo, minimo de apuesta $10000
		 * 
		 * condicion
		 * Mayoria de edad
		 * validar el saldo, no puede realizar apuestas 
		 * Cuanto va apostar
		 * 
		 * 
		 * 
		 */
		

		
