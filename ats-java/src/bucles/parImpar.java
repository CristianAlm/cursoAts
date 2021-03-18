package bucles;

/*
 * Leer un numero hazta que se ingrese 0, para cada uno indicar si es par o impar
 * */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class parImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num; 
		
		num = pedirValor();
		
		while (num !=0) {
			if ((num%2)==0) {
				System.out.println("Es par");
			} else {
				System.out.println("Es impar");
			}
			num = pedirValor();
		}

	}

	private static int pedirValor() {
		// TODO Auto-generated method stub
		int variableLocal=0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese el valor: ");
			variableLocal=Integer.valueOf(entrada.readLine());
		} catch (Exception exc) {
			// TODO: handle exception
			System.out.println(exc);
		}
		
		return variableLocal;
	}

}
