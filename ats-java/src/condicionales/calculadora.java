package condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Programa que simule una calculadora con valores enteros
 * Debe funcionar con s = suma, r =resta, p = producto, d = division
 * 
 * */

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valor1, valor2, resultado = 0;
		char suma = 's', resta = 'r', producto = 'p', division = 'd', operacion;
		
		valor1 = pedirValor();
		valor2 = pedirValor();
		operacion = pedirOperacion();
		
		calcular(resultado, valor1, valor2, operacion, suma, resta, division, producto);

	}

	private static void calcular(int resultado, int valor1, int valor2, char operacion, char suma, char resta, char division, char producto) {
		// TODO Auto-generated method stub
		if (operacion == suma) {
			resultado = valor1+valor2;
		}else if (operacion == resta) {
			resultado = valor1-valor2;
		}else if (operacion == producto) {
			resultado = valor1*valor2;
		}else if (operacion == division) {
			resultado = valor1/valor2;
		}else {
			System.out.println("Hay un error en la eleccion de la operacion.");
		}
		
		System.out.println("El resultado es: " + resultado);
	}

	private static char pedirOperacion() {
		// TODO Auto-generated method stub
		char operacionLocal = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Introduzca la operacion: ");
			operacionLocal=entrada.readLine().charAt(0);
		} catch (Exception exc) {
			// TODO: handle exception
			System.out.println(exc);
		}
		
		return operacionLocal;
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
