package com.generation.f20220526;

import java.util.ArrayList;
import java.util.Collections;

public class ColeccionArrayList {

	public static void main(String[] args) {
		// ArrayList palabra reservada
		// Instancia de clase, definicion de arreglo

		ArrayList<String> colores = new ArrayList<String>();
		ArrayList<Integer> numerosPares = new ArrayList<Integer>();

		// Agregar un elemento a la lista
		colores.add("rojo");
		colores.add("azul");
		colores.add("morado");

		// Imprimir el contenido
		System.out.println(colores);

		// Si existe un elemento en esa posicion lo desplaza a la derecha
		colores.add(0, "verde");

		// Imprimir el contenido
		System.out.println(colores);

		// Acceder a un elemento
		System.out.println(colores.get(2));

		// Tamaño del arreglo size() lenght estatico, size dinamicos
		System.out.println(colores.size());

		// Modificar o cambiar un elemento
		colores.set(1, "negro");
		System.out.println(colores);

		// Quitar un elemento arreglo.remove(posicion)
		colores.remove(1);
		System.out.println(colores);

		// recorrer el arreglo

		for (int i = 0; i < colores.size(); i++) {

			System.out.println(colores.get(i));
		}
		
		System.out.println("\n");
		
		for (String color : colores) { //foreach, se utilizara cuando se trabaje con objetos
			System.out.println("El elemento anterior era: " + color);
			
		}

		//Lo que hace este objeto es ordenar ascendentemente, no es temporal, afecta al arreglo 
		Collections.sort(colores);
		System.out.println(colores);
		
		
		// Eliminar todos los elementos
		colores.clear();
		System.out.println(colores);
		
		numerosPares.add(23);
		numerosPares.add(2);
		numerosPares.add(12);
		numerosPares.add(6);
		numerosPares.add(30);
		numerosPares.add(18);
		
		System.out.print(numerosPares+" ");
		System.out.println();
		Collections.sort(numerosPares);
		System.out.println(numerosPares+" ");
		
		System.out.println();
		Collections.reverse(numerosPares); // no ordena descendentemente
		System.out.print(numerosPares+" ");
		

	}

}
