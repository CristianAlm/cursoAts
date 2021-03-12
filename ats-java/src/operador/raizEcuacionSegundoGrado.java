package operador;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Construir un programa que calcule y muestre por pantalla las raices de la ecuacion de segundo grado
 * de coeficientes reales.
 * 
 *  x= -b+-Raiz(b^2 - 4*a*c)   /2*a
 *  
 * */

public class raizEcuacionSegundoGrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a,b,c,resultado1 = 0,resultado2 = 0;
		
		a = pedirValores();
		b = pedirValores();
		c = pedirValores();
		
		programa(a,b,c, resultado1,resultado2);

	}

	private static void programa(double a, double b, double c, double resultado1, double resultado2) {
		// TODO Auto-generated method stub
		
		resultado1 = (-b+Math.sqrt(Math.pow(b, 2) - (4*a*c))) / (2*a);
		resultado2 = (-b-Math.sqrt(Math.pow(b, 2) - (4*a*c))) / (2*a);
		
		System.out.println("La Raiz1 es: " + resultado1 + " y la Raiz2 es: " + resultado2);
		
	}

	private static int pedirValores() {
		// TODO Auto-generated method stub
		int valorLocal = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese el valor: ");
			valorLocal = Integer.valueOf(entrada.readLine());
		}	
		catch (Exception exc) {
			// TODO: handle exception
			System.out.println(exc);
		}
		return valorLocal;
	}

}
