package com.generation.f20220526;

import java.util.Arrays;

public class ColeccionArray {

	public static void main(String[] args) {
		// Array Estaticos, fijos
		// Conjunto de datos, siempre parte de la posicion 0

		String[] colores = { "rojo", "azul", "amarillo", "naranjo", "negro" };
		Integer[] numerosPares = { 2, 4, 6, 8, 10, 12 };
		int[] primerosNumeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		// posicion inicial es cero (0)
		System.out.println(colores[0]);
		System.out.println(numerosPares[0]);
		System.out.println(primerosNumeros[0]);

		// nombreArray [posicion] -> accediendo al elemento del arreglo en esa posicion

		System.out.println(numerosPares[3]);// selecciona el numero 8

		numerosPares[3] = 14; // modificando el elemento en esa posicion
		System.out.println(numerosPares[3]); // numero 14

		numerosPares[5] = 14; // si se pone un n>5 saldra Error fuera de indice, no se puede agregar una
								// posicion que no existe

		System.out.println("el tamaño del conjunto colores es " + colores.length);
		System.out.println("el tamaño del conjunto pares es " + numerosPares.length);
		System.out.println("el tamaño del conjunto primeros es " + primerosNumeros.length);

		System.out.println(colores.toString());
		System.out.println(numerosPares.toString());
		System.out.println(primerosNumeros.toString());

		// imprimir el contenido del arreglo

		System.out.println(Arrays.toString(colores));
		System.out.println(Arrays.toString(numerosPares));
		System.out.println(Arrays.toString(primerosNumeros));

		// recorrer un arreglo

		for (int i = 0; i < primerosNumeros.length; i++) {

			System.out.print(primerosNumeros[i]+", ");// println con salto de linea, print sin salto de linea
			}
		System.out.println("\n");
			
		for (int i : primerosNumeros) { //foreach, se utilizara cuando se trabaje con objetos
			
			System.out.println(i);
		}
		
		for (String color : colores) {
			
			System.out.println(color);
			
		}
		
	}

}