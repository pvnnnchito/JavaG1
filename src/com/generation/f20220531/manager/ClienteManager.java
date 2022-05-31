package com.generation.f20220531.manager;

import java.util.List;

import com.generation.f20220531.Cliente;

//logica de negocio 
//validaciones, como por ej el correo, cantidad de ventas, el nombre
//todo lo que necesitemos validar, lo hacemos en este tipo de clase

public class ClienteManager {

	// funcion simple - para recorrer el arreglo e imprimir 
	
	public void recorrerArregloCliente (List<Cliente> listaCliente) {
		
		for (Cliente dato : listaCliente) { //
			System.out.println(dato.toString());
			
		}
	}
}
