package condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Hacer un programa que muestre un numero y si es multiplo de diez
 * */

public class multiploDiez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valor = pedirValor();
		
		if (valor%10==0) {
			System.out.println("El valor " + valor + " es multiplo de diez.");
		} else {
			System.out.println("No es multiplo de diez el valor " + valor);
		}
		
		main(args);

	}

	private static int pedirValor() {
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
