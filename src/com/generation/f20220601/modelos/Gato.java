package com.generation.f20220601.modelos;

public class Gato extends Mascota {
			
	//Extends palabra reservada para heredar  
	
	private Boolean garrasRetractil;
	private Boolean visionNocturna;
	
	public Gato() {
		super();
	}

	public Gato(Boolean garrasRetractil, Boolean visionNocturna) {
		super();
		this.garrasRetractil = garrasRetractil;
		this.visionNocturna = visionNocturna;
	}

	public Boolean getGarrasRetractil() {
		return garrasRetractil;
	}

	public void setGarrasRetractil(Boolean garrasRetractil) {
		this.garrasRetractil = garrasRetractil;
	}

	public Boolean getVisionNocturna() {
		return visionNocturna;
	}

	public void setVisionNocturna(Boolean visionNocturna) {
		this.visionNocturna = visionNocturna;
	}

	@Override
	public String toString() {
		return "Gato [garrasRetractil=" + garrasRetractil + ", visionNocturna=" + visionNocturna + " " + super.toString();
	}
	
	@Override
	public void hacerSonido () {
		System.out.println("Miau miau");
	}
}
