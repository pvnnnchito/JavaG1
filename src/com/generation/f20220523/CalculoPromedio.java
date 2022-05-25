package com.generation.f20220523;

public class CalculoPromedio {

	public static void main(String[] args) {

		
		//creamos la variable 
		//int cantidadNotas = 12;
		// hacemos un arreglo de notas 
		Integer[] notas = {20,50,-67,90,1000,0,88,77,58,79,-33,50};

		// promedio = suma de todas las notas / cantidad de notas 
		
		int sumaNotas = 0;// variable acumuladora
		int notasFueraDeRango = 0;
		
		// como recorre el arreglo de notas 
		for (int i = 0; i < notas.length; i++) {
			//validar la nota (negativos o mayores a 100)
			if (notas[i] < 0 || notas[i] > 100) {
				System.out.println("la nota: " + notas[i] + " en la posicion " + (i+1) + " esta fuera de rango.");
				notasFueraDeRango++;
			}
		
		// variable acumuladora actualizada por el recorrido
			sumaNotas = sumaNotas + notas[i];
		}
		
		if(notasFueraDeRango == 0) {// no hay notas fuera de rango
			
		//System.out.println("suma de notas: " + sumaNotas);
		
				float promedio = sumaNotas / notas.length;
				
				System.out.println("\nEl promedio es: "+ promedio);
		// Punto critico 0>
		if(promedio >= 50 && promedio <= 100) {
			System.out.println("El alumno esta aprobado");
		}else if (promedio >= 0 && promedio < 50) {
			System.out.println("El alumno esta reprobado");
		}else {
		
			System.out.println("Inconsistencia en las notas");
		
	}

		}
	}
}
