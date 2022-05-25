package com.generation.f20220525;

import java.util.Scanner;

public class CondicionalesSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// menu
		System.out.println("Ingrese opcion:");
		System.out.println(" 1 sumar \n 2 restar \n 3 multiplicar \n 4 dividir");
		int opcion = sc.nextInt(); // key
		// capturar datos antes de entrar al switch

		switch (opcion) {
		case 1: // accion para la opcion 1
			System.out.println("** suma");
			break;
		case 2:
			System.out.println("** resta");
			break;
		case 3:
			System.out.println("** multiplicar");
			break;
		case 4:// division necesita validacion
			System.out.println("** dividir");
			break;
		default:
			System.out.println("Opcion invalida");
			break;
		}
		System.out.println("Fuera del Switch");
	}
}
