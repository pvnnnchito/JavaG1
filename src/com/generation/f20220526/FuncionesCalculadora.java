package com.generation.f20220526;

public class FuncionesCalculadora {

	public static void main(String[] args) {
		// Math 
		
		// Elevar o potencia
		double numeroElevado = Math.pow(2.5, 3);
		System.out.println("5 elevado a 5 es " + numeroElevado);
		
		//Redondear al entero mayor
		double enteroMayor = Math.ceil(numeroElevado);
		System.out.println(enteroMayor);
		
		//Redondear al entero menor
		double enteroMenor = Math.floor(numeroElevado);
		System.out.println(enteroMenor);
		
		//Redondeo 
		double enteroRedondeado = Math.round(numeroElevado);
		System.out.println(enteroRedondeado);
		
		double num1 = 12;
		double num2 = 5;
		double div = num1/num2;
		System.out.println(div);
		
		//numeros aleatorios
		//Math.random () >= 0.0 y < 1.0
		double aleatorio = Math.random();
		System.out.println(aleatorio);
		
		//numeros aleatorios entre 0 y algun numero (x), se multiplica random por el numero (x)
		double num010 = Math.random() * 10;
		System.out.println(num010);
		
		//numeros aleatorios entre dos numero, en este caso 2 y 8
		//Math.random() * (max - min) + min;
		
		double num28 = (Math.random() * (8-2)) + 2;
		System.out.println(num28);
		System.out.println(Math.abs(num28));
		System.out.println(Math.round(num28));
		
		//numero aleatorio entre -4 y 4 
		double numNegPos = (Math.random() * (4-(-4)))+(-4);
		System.out.println(numNegPos);
		
		
		
	}

}
