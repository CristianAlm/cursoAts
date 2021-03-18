package bucles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se ingrese un numero negativo.
 * */

public class cuadradoNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, cuadrado; 
		
		num = pedirValor();
		
		while (num >=0) {
			cuadrado = num * num;
			
			System.out.println("El cuadrado de " + num + " es: " + cuadrado);
			
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
