package condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Hacer un programa que pida dos valores y digan si ambos son pares o impares
 * */

public class paresimpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor1, valor2;
		
		valor1 = pedirValor();
		valor2 = pedirValor();
		
		if ((valor1%2)==0 && (valor2%2)==0) {
			System.out.println("Ambos son pares");
		} else {
			System.out.println("Al menos uno es impar");
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
