package com.generation.f20220527;

public class Auto {

	// Clase es modelo o prototipo, para crear objetos
	// Objeto, nace a partir de la clase, tiene caracteristicas o atributos
	// Tiene metodos o funciones
	// Algo concreto, lo convertimos en abstracto (no tangible)
	// tangible: usamos los 5 sentidos para describir
	// Atributo de colaboracion, tomar un objeto y utilizarlo como atributo

	// atributo
	// accesador tipo nombreDelAtributo
	private String color;
	private String marca;
	private String modelo;
	private Double velocidad;

	// Constructores
	
	// constructor vacio
	public Auto() {

	}

	// constructor con parametros, de preferencia los constructores siempre deben ser publicos
	public Auto(String color, String marca, String modelo, Double velocidad) {

		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
	}

	// Accesadores y mutadores (get y set)	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}

	// metodos o funciones personalizadas
	
	public void aumentarVelocidad () { // las funciones que sean creadas dentro de un objeto no llevan static
		this.velocidad = 10d; // a esta variable (this) le vamos a crear un valor 
	}

	
}
