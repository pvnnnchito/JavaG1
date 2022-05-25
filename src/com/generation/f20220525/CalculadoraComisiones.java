package com.generation.f20220525;

​import java.util.Scanner;​

public class CalculadoraComisiones {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Inicializamos el Scanner
        
        
        int precioTicket = 3500; //precio de los tickets normaLes
        int edadMayor = 60;
        int edadMenor = 16;
        
        
        float descuentoMinimo = 0.60f; //en vez de multiplicar por 60 y dividir el resultado en 100, así se acorta
        							   //Ahora lo mismo pero para los abuelos
        float descuentoMayores = 0.55f; //en vez de multiplicar por 55 y dividir el resultado en 100, así se acorta
​		
		float descuento30 = 0.30f; // Descuento adicional
​
        System.out.println("Ingrese su edad: ");//Solicitamos el ingreso de edad de la persona
        int edadPersona = sc.nextInt();//Capturamos el ingreso de edad de la persona
​
​
        if (edadPersona > 0) {
            if (edadPersona < edadMayor && edadPersona > edadMenor) {//Si la edad de la persona esta entra los 16 y 60 años su ticket es de 3500
                System.out.println("Su ticket es de $3.500");
                System.out.println("Ingrese la cantidad de Tickets que desea comprar: ");
                int numeroTickets = sc.nextInt();
                if (numeroTickets > 1) {
                    System.out.println("Su compra tiene un descuento de un 30% adicional");
                    int precioTotalTickets = precioTicket * numeroTickets;
                    float precioDescuentoAdicional = precioTotalTickets * descuento30;
                    float precioFinalAdicional = precioTotalTickets - precioDescuentoAdicional;
                    System.out.println("Su precio final de compra es: " + precioFinalAdicional);
                } else {
                    System.out.println("El precio por 1 ticket es de " + precioTicket);
​
                }
​
            } else if (edadPersona < edadMenor) {
                System.out.println("Su ticket tiene un 60% de descuento");// si la edad de la persona es menor a los 16 años su ticket tiene un descuento del 60%
                float descuento60 = precioTicket * descuentoMinimo; //este sera el monto que se descuenta a normal a los menores iguales a 15 años
                //se tendra que restar descuento60 de precio ticket para que entregue el valor final con dcto aplicado
                //no se si será float
                float finalMinimo = precioTicket - descuento60; //lo que devolvera sera el 40% del precio de entrada normal, lo que se debera pagar
                System.out.println("Su precio final es de " + finalMinimo);
​
            } else if (edadPersona > edadMayor) {
                System.out.println("Su ticket tiene un 55% de descuento");// si la edad de la persona es mayor a 60 años su ticket tiene un descuento del 55%
                float descuento55 = precioTicket * descuentoMayores; //este sera el monto que se descuenta a normal a los mayores de 60(excluyendo 60)
                //desconozco si corresponde un float aqui
                float finalMayores = precioTicket - descuento55; //lo que devolvera sera el 45% restante de la entrada, que sera el monto a pagar
                System.out.println("Su precio final es de " + finalMayores);
            }
        }else {
            System.out.println("Ingrese una edad valida");
        }
	}
}
