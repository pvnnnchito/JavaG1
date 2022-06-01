package com.generation.f20220601.pruebasunitarias;

public class Calculadora {

	public int suma(int num1, int num2) {
		return num1 + num2;
	}

	public int resta(int num1, int num2) {
		return num1 - num2;
	}

	public int multiplicacion(int num1, int num2) {
		return num1 * num2;
	}

	public String division(int num1, int num2) {
		if (num2 != 0) {
			String resultadoDivision = Integer.toString(num1 / num2);
			return resultadoDivision;

		}
		return "No se puede dividir";
	}

	public String numPares(int numero){
        if(numero % 2 == 0){
            String resultado = "Tu numero es par";
            return resultado;
        }        
        return "Tu numero es Impar";
    }

	public String numImpar(int numero) {
		if(numero % 2 != 0) {
			String resultado = "Tu numero es impar";
			return resultado;
		}
		return "Tu numero es Par";
	} 
	
	
}

