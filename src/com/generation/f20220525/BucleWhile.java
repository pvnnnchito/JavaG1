package com.generation.f20220525;

import java.util.Scanner;

public class BucleWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// menu
		System.out.println(" Ingrese una opcion");
		System.out.println(" (0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
		int opcion = sc.nextInt(); // capturando el ingreso por consola

				
		// while valida que la condicion sea verdadera,
		// el while se ocupa muchas veces para preguntar lo contrario al pto critico
		while (opcion < 0 || opcion > 4) {// V y V = V

			System.out.println(" Ingrese una opcion");
			System.out.println(" (0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
			opcion = sc.nextInt();
		}
		System.out.println("Fuera del while");

		switch (opcion) {
		case 1:// sumar
				// accion para la opcion 1
			System.out.println("** Suma");
			break;
		case 2:
			System.out.println("** Resta");
			break;
		case 3:
			System.out.println("** Multiplicacion");
			break;
		case 4:// division
			System.out.println("** Division");
			break;
		default:
			System.out.println("opcion invalida");
			break;
		}

		int termino = 0;

		while (termino <= 10) {
			System.out.println("el valor de termino es " + termino);
			termino++;
		}

	}
}
