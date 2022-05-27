package com.generation.f20220526;

import java.util.Scanner;

public class Funciones {

	public static void main(String[] args) {
		// Funciones
		// 4 tipo de funciones
		// Publica que se puede llamar de cualquier lado
		// 2 que retornan
		// 2 no retornan
		// nombre_funcion se escribe con minuscula la primera letra, siempre
		// la impresion estampa la respuesta
		// no puede CREAR un metodo dentro de otro metodo pero si se puede llamar a otro metodo
		
		saludo(); // llamada al metodo 
		calculoSumaPares(23, "44", 27l, "sumar", true);
		
		int edad = obtenerEdad();
		System.out.println(edad);
		
		Boolean mayorMenor = validarMayorEdad(edad);
		
		if(mayorMenor) {
			System.out.println("Puede ingresar al curso");
		}else {
			System.out.println("No tiene la edad suficiente para acceder al curso");
		}

	}
	// accesador tipo_de_retorno nombre_funcion(parametro a recibir)
	// cuando no queramos retornar algo se escribe void, las funciones de tipo void
	// solo ejecuta codigo

	public static void calculoSumaPares (int numero1, String numero2, Long numero3, String accion, boolean verdad) {
		
		Integer num2 = Integer.parseInt(numero2);
		System.out.println(numero1 + numero3 + num2);
		
	}
	//static nos permite acceder al metodo 
	//solicitar el ingreso de datos
	public static void saludo() {
		System.out.println("Buenos dias");
		
	}
	
	//funciones que retornan un tipo de datos
	public static Integer obtenerEdad() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese edad");
		Integer edad = scanner.nextInt();
		
		return edad; //retornar el contenido de la variable
		
	}
			//    retorna						pide
	public static Boolean validarMayorEdad(Integer edad) { //funcion que recibe datos y retorna datos 
		if (edad >= 18) {
			System.out.println("Es mayor de edad");
			return true;
		}else {
			System.out.println("Es menor de edad");
			return false; 
	}		//return true; false
	
	
	
	}
}
