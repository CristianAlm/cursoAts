package condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Hacer un programa que diga si la letra es mayuscula o minuscula
 * */

public class mayusMinuscu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a;
		
		a = pedirValor();
		
		porCondicional(a);
		porUpper(a);
		

	}

	private static void porCondicional(char a) {
		// TODO Auto-generated method stub
		if ((a >= 'A') && (a <='Z')) {
			System.out.println("Mayuscula");
		}else if (a >= 'a' && a <= 'z') {
			System.out.println("Miniscula");
		}
		else {
			System.out.println("No es una letra");
		}
	}

	private static void porUpper(char a) {
		// TODO Auto-generated method stub
		if (Character.isUpperCase(a)) {
			System.out.println("La letra es mayuscula.");
		} else {
			System.out.println("La letra es minuscula.");
		}
		
	}

	private static char pedirValor() {
		// TODO Auto-generated method stub
		char valorLocal = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese el valor: ");
			valorLocal = entrada.readLine().charAt(0);
		}	
		catch (Exception exc) {
			// TODO: handle exception
			System.out.println(exc);
		}
		return valorLocal;
	}

}
