package com.generation.f20220601.modelos;

public class Perro extends Mascota{

		//palabra reservada extends, siginifica que estamos usando herencia 
		//
	private Integer cantPaseos;
	private Float tamanoHocico;
	private String sonidoVocal;
	
	
	public Perro() {
		super();
	}


	public Perro(Integer cantPaseos, Float tamanoHocico, String sonidoVocal) {
		super();
		this.cantPaseos = cantPaseos;
		this.tamanoHocico = tamanoHocico;
		this.sonidoVocal = sonidoVocal;
	}


	public Integer getCantPaseos() {
		return cantPaseos;
	}


	public void setCantPaseos(Integer cantPaseos) {
		this.cantPaseos = cantPaseos;
	}


	public Float getTamanoHocico() {
		return tamanoHocico;
	}


	public void setTamanoHocico(Float tamanoHocico) {
		this.tamanoHocico = tamanoHocico;
	}


	public String getSonidoVocal() {
		return sonidoVocal;
	}


	public void setSonidoVocal(String sonidoVocal) {
		this.sonidoVocal = sonidoVocal;
	}


	@Override
	public String toString() {
		return "Perro [cantPaseos=" + cantPaseos + ", tamanoHocico=" + tamanoHocico + ", sonidoVocal=" + sonidoVocal
				+ "]";
	}
	@Override
	public void hacerSonido () {
		System.out.println("Guau Guau!!");
	}
	
	
}
