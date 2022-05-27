package com.generation.f20220527;

import java.util.ArrayList;
import java.util.HashMap;

public class ColeccionesMap {

	public static void main(String[] args) {
		// Colecciones Map 
		// Pares clave <-> valor
		
		// HashMap<K, V> map = new HashMap<K, V>();
		// K = key o clave; V = value o valor
		// Hashmap mapa = new HashMap ();
		
		HashMap objHashMap = new HashMap();
		
		System.out.println("Elementos del mapa");
		
		objHashMap.put("Nombre", "Francisco");
		objHashMap.put("ApellidoP", "Perez");
		objHashMap.put("ApellidoM", "Morales");
		objHashMap.put("Edad","26");
		
		//Obtener un valor a traves de la clave
		System.out.println(objHashMap.get("ApellidoM"));
		
		//Eliminar par 
		objHashMap.remove("Edad");
		System.out.println(objHashMap);
		
		//Mostrar todas las llaves disponibles
		System.out.println(objHashMap.keySet());
		
		//Mostrar todos los valores en el mapa
		System.out.println(objHashMap.values());
		
		// el HashMap es lo mas cercano que tendremos a una API
		
		ArrayList<String> vocales = new ArrayList<String>();
		vocales.add("a");
		vocales.add("e");
		vocales.add("i");
		vocales.add("o");
		vocales.add("u");
		
		objHashMap.put("Vocales", vocales);
		System.out.println(objHashMap);
		
		//Si no encuentra la clave, retorna un null 
		System.out.println(objHashMap.get("vocales"));
		
		//Ejercicio
		//Crear un menu de comida
		//Solicitar al usuario que elija el plato
		//Imprimir el plato 
		
		//como recorrer un hashmap
		
		
		for(Object clave : objHashMap.keySet()) {
			System.out.println("clave: "+ clave +" - valor:  "+objHashMap.get(clave));
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
