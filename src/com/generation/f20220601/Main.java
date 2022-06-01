package com.generation.f20220601;

import java.util.ArrayList;
import java.util.List;

import com.generation.f20220601.modelos.Gato;
import com.generation.f20220601.modelos.Mascota;
import com.generation.f20220601.modelos.Mishi;
import com.generation.f20220601.modelos.Perro;

public class Main {

	public static void main(String[] args) {
		// Herencia
		// Sobreescritura de metodos, override, cuando nosotros heredamos
		
		
		Mascota mascota = new Mascota (); // la importamos porque esta fuera del package
		mascota.setColor("Gris");
		mascota.setNombre("Tom");
		
		
		Perro perro = new Perro ();// creamos una instancia, e importamos desde otro package
		perro.setColor("RedFaund");
		perro.setNombre("Ayun");
		
		
		Gato gato = new Gato ();// hacemos lo mismo que con perro, creamos instancia e importamos
		gato.setEspecie("Felino");
		gato.setPelaje("Pelo");
		gato.setPeso(3);
		
		System.out.println(gato.toString());
		
		Mishi mishi = new Mishi(true);
		
		//nosotros estamos heredando de gato por lo que estamos sobreescribiendo el metodo de gato
		//
		System.out.println(mishi.toString());
		
		/* Polimorfismo = muchas formas
		 * dar caracteristicas, 
		 */
		List<Mascota> listaMascotas = new ArrayList<Mascota>(); // creamos una lista y una nueva instancia de lista
		Mascota regalon = new Mascota ("Negro", "Can", "Pelo", "Firulais", 1.5f, "Macho");
		listaMascotas.add(regalon);
		
		Mascota felix = new Gato();
		felix.setNombre("Felix");
		felix.setColor("Negro");
		felix.setPeso(3);
		listaMascotas.add(felix);
		
		Mascota chocolo = new Perro ();
		chocolo.setNombre("Chocolo");
		chocolo.setColor("Cafe");
		chocolo.setPeso(10);
		listaMascotas.add(chocolo);
		
		regalon.hacerSonido();//llamando al metodo en mascota
		felix.hacerSonido();
		chocolo.hacerSonido();
		
		System.out.println("******");
		//recorrer el arreglo
		for (Mascota mascota2 : listaMascotas) {
			mascota2.hacerSonido();
		}

		// transformar el objeto 
		//crear una variable
		//tomar chocolo y se lo asigno a perroChocolo 
		// trasformamos el objeto generico a uno especifico
		// leer de derecha a izq
		
		Perro perroChocolo = (Perro) chocolo;
		perroChocolo.setCantPaseos(6);
		
		
	}

}
