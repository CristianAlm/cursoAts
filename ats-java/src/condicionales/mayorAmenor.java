package condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Hacer un programa que pida tres numeros y los imprima de mayor a menor
 * */

public class mayorAmenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		
		a = pedirValor();
		b = pedirValor();
		c = pedirValor();
		
		if (a > b && a> c && b > c) {
			System.out.println("El valor mayor es: " + a + " el del medio es: " + b + " y el menor es: " + c);
		}else if (b > a && b> c && a > c) {
			System.out.println("El valor mayor es: " + b + " el del medio es: " + a + " y el menor es: " + c);
		}else if (c > a && c > b && a > b) {
			System.out.println("El valor mayor es: " + c + " el del medio es: " + a + " y el menor es: " + b);
		}else if (a > b && a> c && c > b) {
			System.out.println("El valor mayor es: " + a + " el del medio es: " + c + " y el menor es: " + b);
		}else if (b > a && b> c && c > a) {
			System.out.println("El valor mayor es: " + b + " el del medio es: " + c + " y el menor es: " + a);
		}else if (c > a && c > b && b > a) {
			System.out.println("El valor mayor es: " + c + " el del medio es: " + b + " y el menor es: " + a);
		}
	}

	private static int pedirValor() {
		// TODO Auto-generated method stub
		int variableLocal=0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Introduzca el valor: ");
			variableLocal=Integer.valueOf(entrada.readLine());
		} catch (Exception exc) {
			// TODO: handle exception
			System.out.println(exc);
		}
		
		return variableLocal;
	}

}
