package com.generation.f20220530;

import java.util.ArrayList;
import java.util.List;

import com.generation.f20220531.Cliente;

public class Main {

	public static void main(String[] args) {
		
		List <Alumno> listaAlumnos = new ArrayList <Alumno> (); 
		// List interfaz, las interfaces solo van a definir los metodos, es solo estructura
		// arraylist es una clase, tiene atributos, funciones, metodos implementa los metodos
		// instancia de una clase = invocar a un objeto 
		
		Alumno alumno = new Alumno ();
		Alumno alumno2 = new Alumno ("Francisco", "Perez", 26, "G1");
		
		listaAlumnos.add(alumno);
		listaAlumnos.add(alumno2);
		
		System.out.println(alumno.getNombre());
		System.out.println(alumno2.getNombre());
		
		
		//setter
		
		alumno.setNombre("Javier");
		System.out.println(alumno.getNombre());
		
		System.out.println(alumno2.toString());
		
		for (int i = 0; i < listaAlumnos.size(); i++) {
			System.out.println(listaAlumnos.get(i).getNombre());
			System.out.println(listaAlumnos.get(i).getApellido());
			
		}
		
		for (Alumno objetoAlumno : listaAlumnos) {
			//System.out.println(objetoAlumno.getNombre());
			//System.out.println(objetoAlumno.getCurso());
			System.out.println(objetoAlumno.toString());
		
		}
		
		
		
		// crear tantas instancias como miembros del equipo existan
        // asignar los datos a las instancias
        //imprimir los valores

       /*
        Alumno alumno01 = new Alumno("Luis ","Mejias",28," G1");
        Alumno alumno02 = new Alumno("Leonardo ","Utreras",26," G1");
        Alumno alumno03 = new Alumno("Mary ","Aedo",18," G1");
        Alumno alumno04 = new Alumno("Francisco ","Perez",26," G1");
        Alumno alumno05 = new Alumno("Francisco ","Cid",25," G1");
        Alumno alumno06 = new Alumno("Ignacio ","Romero",23," G1");
        
        System.out.println(alumno01.getNombre() + alumno01.getApellido() + ", " + alumno01.getEdad() +" años," + alumno01.getCurso());
        System.out.println(alumno02.getNombre() + alumno02.getApellido() + ", " + alumno02.getEdad() +" años," +  alumno02.getCurso());
        System.out.println(alumno03.getNombre() + alumno03.getApellido() + ", " + alumno03.getEdad() +" años," + alumno03.getCurso());
        System.out.println(alumno04.getNombre() + alumno04.getApellido() + ", " + alumno04.getEdad() +" años," +  alumno04.getCurso());
        System.out.println(alumno05.getNombre() + alumno05.getApellido() + ", " + alumno05.getEdad() +" años," +  alumno05.getCurso());
        System.out.println(alumno06.getNombre() + alumno06.getApellido() + ", " + alumno06.getEdad() +" años," +  alumno06.getCurso());*/

		
		
    }

		
		// Alumno = objeto, alumno = variable 
		//() es hacer uso del constructor vacio, a posterior sirve para asginar valores para mis atributos 
		// get = obtener, set = asignar atributo 
		// atributo es una variable del objeto 
		// sobreescritura y sobrecarga de metodos 
		
		// main crear instancias como miembros del equipo, asignar datos, nombre apellido edad G1
	
}


