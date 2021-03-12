package condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Pedir dos valores y decir cual es mayor o si son iguales
 * */

public class compararValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valor1, valor2;
		
		valor1 = pedirValor();
		valor2 = pedirValor();
		
		if (valor1 > valor2) {
			System.out.println("Es mayor el: " + valor1);
		}else if (valor1 < valor2) {
			System.out.println("Es mayor el: " + valor2);
		} else if (valor1 == valor2) {
			System.out.println("Son iguales");
		}

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
