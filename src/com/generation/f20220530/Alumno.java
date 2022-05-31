package com.generation.f20220530;

public class Alumno {
	
	//atributos
	private String nombre;
	private String apellido; 
	private int edad;
	private String curso;
	
	public Alumno() {
		super();
	}

	public Alumno(String nombre, String apellido, int edad, String curso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.curso = curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", curso=" + curso + "]";
	} 
	
	
	
	
	// encapsulamiento, proteger la informacion, no cualquiera podra tener acceso 
	// porque solo podemos acceder dentro de la misma clase
	// protected desde el package
	// public de cualquier parte
	
	
	
	//constructores
	
	
	
	//getter y setters
	//funciones
	
	

}
